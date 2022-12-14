import java.util.LinkedList;
import java.util.List;

public class ElseClause extends Statement {
    FieldList fieldList;
    StatementList statements;

    public ElseClause(FieldList fieldList, StatementList statements) {
        this.fieldList = fieldList;
        this.statements = statements;
    }

    public ElseClause() {
        this.fieldList = null;
        this.statements = null;
    }

    @Override
    public String toString(int t) {
        if (fieldList == null || statements == null)
            return "";
        return printParams("", 0, " else {\n")
                + printParams("", t + 1, fieldList.toString(t + 1), statements.toString(t + 1), "\n", getTabs(t), "}");
    }

    @Override
    public List<DataType> getReturnTypes() throws CompilerException {
        if (statements == null)
            return new LinkedList<>();
        return statements.getReturnTypes();
    }
}
