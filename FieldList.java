import java.util.List;
import java.util.LinkedList;

public class FieldList extends Token {
    List<Field> fieldList;

    public FieldList() {
        fieldList = new LinkedList<>();    
    }

    public FieldList prepend(Field f) {
        fieldList.add(0, f);
        return this;
    }

    @Override
    public String toString(int t) {
        return printParams("", 0, printLineList(fieldList, t), fieldList.isEmpty() ? "" : "\n" + getTabs(t));
    }
}
