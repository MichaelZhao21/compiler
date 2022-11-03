import java.util.List;
import java.util.LinkedList;

public class DeclerationList extends Token {
    List<Decleration> declerationList;

    public DeclerationList() {
        this.declerationList = new LinkedList<>();
    }
    
    public DeclerationList prepend(Decleration field) {
        declerationList.add(0, field);
        return this;
    }

    @Override
    public String toString(int t) {
        return printParams("", t, printLineList(declerationList, t));
    }
}
