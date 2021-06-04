import java.util.Comparator;

public class ComparatorSex implements Comparator<PersonJSONObject> {

    @Override
    public int compare(PersonJSONObject o1, PersonJSONObject o2) {
        return o1.getSex().compareTo(o2.getSex());
    }

    @Override
    public Comparator<PersonJSONObject> reversed() {
        return Comparator.super.reversed();
    }
}
