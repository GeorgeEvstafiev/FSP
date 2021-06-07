import java.util.Comparator;

public class ComparatorName implements Comparator<PersonJSONObject> {

    @Override
    public int compare(PersonJSONObject o1, PersonJSONObject o2) {
        return o1.getName().compareTo(o2.getName());
    }

    @Override
    public Comparator<PersonJSONObject> reversed() { return Comparator.super.reversed(); }
}
