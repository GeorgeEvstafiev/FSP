package Comparators;

import java.util.Comparator;
import DescriptionObject.PersonJSONObject;

public class ComparatorBirthDate implements Comparator<PersonJSONObject> {

    @Override
    public int compare(PersonJSONObject o1, PersonJSONObject o2) { return o1.getBirthDate().compareTo(o2.getBirthDate()); }

    @Override
    public Comparator<PersonJSONObject> reversed() {
        return Comparator.super.reversed();
    }
}
