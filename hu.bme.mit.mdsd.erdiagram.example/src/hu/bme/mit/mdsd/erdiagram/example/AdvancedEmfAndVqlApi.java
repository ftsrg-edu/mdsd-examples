package hu.bme.mit.mdsd.erdiagram.example;

import java.util.Collection;
import java.util.Set;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreSwitch;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.ecore.util.EcoreUtil.EqualityHelper;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseQueryGroup;
import org.eclipse.viatra.query.runtime.base.api.InstanceListener;
import org.eclipse.viatra.query.runtime.base.api.NavigationHelper;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

import com.google.common.collect.Sets;

import hu.bme.mit.mdsd.erdiagram.Attribute;
import hu.bme.mit.mdsd.erdiagram.Entity;
import hu.bme.mit.mdsd.erdiagram.EntityRelationDiagram;
import hu.bme.mit.mdsd.erdiagram.ErdiagramPackage;
import hu.bme.mit.mdsd.erdiagram.queries.EntityCompareMatch;
import hu.bme.mit.mdsd.erdiagram.queries.EntityCompareMatcher;
import hu.bme.mit.mdsd.erdiagram.queries.Queries;
import hu.bme.mit.mdsd.erdiagram.queries.util.EntitiesQuerySpecification;
import hu.bme.mit.mdsd.erdiagram.queries.util.EntityCompareProcessor;
import hu.bme.mit.mdsd.erdiagram.queries.util.EntityCompareQuerySpecification;
import hu.bme.mit.mdsd.erdiagram.util.ErdiagramSwitch;

public class AdvancedEmfAndVqlApi {

    public static void main(String[] args) throws ViatraQueryException {

        ErdiagramModels erdiagramModels = new ErdiagramModels();
        erdiagramModels.init();
        
        Resource resource = erdiagramModels.loadResource(URI.createFileURI(
                "C:\\Users\\meres\\git\\mdsd-examples\\hu.bme.mit.mdsd.erdiagram.examplediagrams\\My.erdiagram"));
        
        EntityRelationDiagram model = erdiagramModels.getModelFromResource(resource);
        
        Attribute attribute = model.getEntities().get(0).getAttributes().get(0);
        EObject rootContainer = EcoreUtil.getRootContainer(attribute);
        System.out.println(model.equals(rootContainer));
        
        EntityRelationDiagram clone = (EntityRelationDiagram) clone(model);
        System.out.println(model.equals(clone));
        
        equals(model, clone);
        
        attribute.setName("something");
        
        equals(model, clone);
        
        
        ErdiagramSwitch<String> erdiagramSwitch = new ErdiagramSwitch<String>() {
            @Override
            public String caseAttribute(Attribute object) {
                return object.getName() + " : " + object.getType();
            }

            @Override
            public String defaultCase(EObject object) {
                return "default";
            }
        };
        
        TreeIterator<EObject> treeIterator = model.eAllContents();
        while (treeIterator.hasNext()) {
            EObject eObject = (EObject) treeIterator.next();
            
            for (EAttribute eAttribute : eObject.eClass().getEAllAttributes()) {
                if (eAttribute.getName().equals("name")) {
                    eObject.eSet(eAttribute,
                            Integer.toString(eObject.eGet(eAttribute).hashCode()));
                }
            }
            System.out.println(erdiagramSwitch.doSwitch(eObject));
        }
        
        EcoreSwitch<String> ecoreSwitch = new EcoreSwitch<String>() {
            @Override
            public String caseEEnum(EEnum object) {
                return "Enum: " + object.getName();
            }
            @Override
            public String caseEEnumLiteral(EEnumLiteral object) {
                return " Literal: " + object.getName();
            }            @Override
            public String defaultCase(EObject object) {
                return object.toString();
            }
        };
        
        EPackage ePackage = model.eClass().getEPackage();
        TreeIterator<EObject> treeIterator2 = ePackage.eAllContents();
        while (treeIterator2.hasNext()) {
            EObject eObject = (EObject) treeIterator2.next();
            System.out.println(ecoreSwitch.doSwitch(eObject));
        }
        
        
        model.eAdapters().add(new AdapterImpl() {
            @Override
            public void notifyChanged(Notification msg) {
                
                System.out.println(msg.getNotifier() + " : " + msg.getOldStringValue()
                        + " -> " + msg.getNewStringValue());
                
                super.notifyChanged(msg);
            }
        });
        
        model.setName("dfd");
        model.getEntities().remove(0);
        
        // Editing Domain
        
        // EMap
        
        // VQL API
        
        BasicConfigurator.configure();
        Logger.getRootLogger().setLevel(Level.WARN);
        
        EMFScope scope = new EMFScope(clone);
        ViatraQueryEngine queryEngine = ViatraQueryEngine.on(scope);
        EntityCompareMatcher matcher = queryEngine.getMatcher(EntityCompareQuerySpecification.instance());
        int countMatches = matcher.countMatches();
        System.out.println(countMatches);
        
        Collection<EntityCompareMatch> allMatches = matcher.getAllMatches(clone.getEntities().get(0), null);
        for (EntityCompareMatch match : allMatches) {
            System.out.println(match.getE1().getName() + " : " + match.getE2().getName());
        }
        
        matcher.forEachMatch(new EntityCompareProcessor() {
            
            @Override
            public void process(Entity pE1, Entity pE2) {
                System.out.println(pE1.getName() + " : " + pE2.getName());
            }
        });
        
        Queries.instance().prepare(queryEngine);
        
        new BaseQueryGroup() {
            
            @Override
            public Set<IQuerySpecification<?>> getSpecifications() {
                try {
                    return Sets.newHashSet(EntitiesQuerySpecification.instance());
                } catch (ViatraQueryException e) {
                    e.printStackTrace();
                }
                return null;
            }
        }.prepare(queryEngine);
        
        NavigationHelper navigationHelper = EMFScope.extractUnderlyingEMFIndex(queryEngine);
        
        navigationHelper.addInstanceListener(Sets.newHashSet(
                ErdiagramPackage.Literals.ENTITY),
                new InstanceListener() {
                    
                    @Override
                    public void instanceInserted(EClass clazz, EObject instance) {
                        System.out.println("Inserted: " + instance);
                    }
                    
                    @Override
                    public void instanceDeleted(EClass clazz, EObject instance) {
                        System.out.println("Deleted: " + instance);
                    }
                });
        
        Entity entity = clone.getEntities().remove(0);
        clone.getEntities().add(entity);
        
    }

    public static void equals(EObject model, EObject clone) {
        EqualityHelper helper = new EqualityHelper();
        boolean equals = helper.equals(model, clone);
        System.out.println(equals);
    }

    public static EObject clone(EObject model) {
        Copier copier = new Copier();
        EObject clone = copier.copy(model);
        copier.copyReferences();
        return clone;
    }

}
