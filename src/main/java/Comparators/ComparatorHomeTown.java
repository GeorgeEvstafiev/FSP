package Comparators;

import java.util.Comparator;
import DescriptionObject.PersonJSONObject;

public class ComparatorHomeTown implements Comparator<PersonJSONObject> {

    @Override
    public int compare(PersonJSONObject o1, PersonJSONObject o2) { return o1.getHomeTown().compareTo(o2.getHomeTown()); }

    @Override
    public Comparator<PersonJSONObject> reversed() {
        return Comparator.super.reversed();
    }
}
