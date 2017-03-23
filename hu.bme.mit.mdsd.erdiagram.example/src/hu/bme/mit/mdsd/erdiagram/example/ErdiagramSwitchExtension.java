package hu.bme.mit.mdsd.erdiagram.example;

import org.eclipse.emf.ecore.EObject;

import hu.bme.mit.mdsd.erdiagram.Attribute;
import hu.bme.mit.mdsd.erdiagram.util.ErdiagramSwitch;

final class ErdiagramSwitchExtension extends ErdiagramSwitch<String> {
    @Override
    public String caseAttribute(Attribute object) {
        return object.getName() + " : " + object.getType();
    }

    @Override
    public String defaultCase(EObject object) {
        return "default";
    }
}