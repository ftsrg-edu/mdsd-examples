package hu.bme.mit.mdsd.m2m2c;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import hu.bme.mit.mdsd.rdb.Column;
import hu.bme.mit.mdsd.rdb.ColumnType;
import hu.bme.mit.mdsd.rdb.ForeignKey;
import hu.bme.mit.mdsd.rdb.Key;
import hu.bme.mit.mdsd.rdb.RelationalDataBase;
import hu.bme.mit.mdsd.rdb.Table;
import java.io.File;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class RdbToSqlGenerator {
  private RelationalDataBase rdb;
  
  public RdbToSqlGenerator(final RelationalDataBase rdb) {
    this.rdb = rdb;
  }
  
  public void generateSql() {
    try {
      CharSequence _generateAll = this.generateAll();
      File _file = new File("createRdb.sql");
      Files.write(_generateAll, _file, Charsets.UTF_8);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public CharSequence generateAll() {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Table> _tables = this.rdb.getTables();
      for(final Table table : _tables) {
        CharSequence _generateCreateTable = this.generateCreateTable(table);
        _builder.append(_generateCreateTable, "");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence generateCreateTable(final Table table) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("create table ");
    String _name = table.getName();
    _builder.append(_name, "");
    _builder.append(" (");
    _builder.newLineIfNotEmpty();
    {
      EList<Column> _columns = table.getColumns();
      for(final Column column : _columns) {
        _builder.append("\t");
        String _name_1 = column.getName();
        _builder.append(_name_1, "\t");
        _builder.append(" ");
        ColumnType _type = column.getType();
        String _columnTypeToDataType = this.columnTypeToDataType(_type);
        _builder.append(_columnTypeToDataType, "\t");
        _builder.append(" ");
        {
          if ((column instanceof Key)) {
            _builder.append("primary key");
          }
        }
        {
          if ((column instanceof ForeignKey)) {
            _builder.append("foreign key (");
            Key _referencedKey = ((ForeignKey)column).getReferencedKey();
            String _name_2 = _referencedKey.getName();
            _builder.append(_name_2, "\t");
            _builder.append(")");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append(")");
    _builder.newLine();
    return _builder;
  }
  
  public String columnTypeToDataType(final ColumnType type) {
    String _switchResult = null;
    if (type != null) {
      switch (type) {
        case BOOLEAN:
          _switchResult = "boolean";
          break;
        case DATETIME:
          _switchResult = "timestamp";
          break;
        case DOUBLE:
          _switchResult = "float";
          break;
        case INT:
          _switchResult = "integer";
          break;
        case STRING:
          _switchResult = "varchar(50)";
          break;
        default:
          _switchResult = null;
          break;
      }
    } else {
      _switchResult = null;
    }
    return _switchResult;
  }
}
