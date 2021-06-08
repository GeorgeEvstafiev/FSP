package Comparators;

import java.util.Comparator;
import DescriptionObject.PersonJSONObject;

public class ComparatorSurname implements Comparator<PersonJSONObject>  {

    @Override
    public int compare(PersonJSONObject o1, PersonJSONObject o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }

    @Override
    public Comparator<PersonJSONObject> reversed() { return Comparator.super.reversed(); }
}