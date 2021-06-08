package SortedFiltred;

import Interface.Sorted;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
import DescriptionObject.PersonJSONObject;

public class SortedViaStreamImpl implements Sorted {

    private ArrayList<PersonJSONObject> ListPersonJSONObject;

    public void setListPersonJSONObject(ArrayList<PersonJSONObject> aListPersonJSONObject) {
        ListPersonJSONObject = aListPersonJSONObject;
    }

    private ArrayList<PersonJSONObject> getListPersonJSONObject(){
        return ListPersonJSONObject;
    }

    public SortedViaStreamImpl() {
    }

    @Override
    public ArrayList<PersonJSONObject> SortedUpToName() {
        return getListPersonJSONObject().stream()
                .sorted(Comparator.comparing(PersonJSONObject::getName))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public ArrayList<PersonJSONObject> SortedUpToSurname() {
        return getListPersonJSONObject().stream()
                .sorted(Comparator.comparing(PersonJSONObject::getSurname))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public ArrayList<PersonJSONObject> SortedUpToSex() {
        return getListPersonJSONObject().stream()
                .sorted(Comparator.comparing(PersonJSONObject::getSex))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public ArrayList<PersonJSONObject> SortedUpToHomeTown() {
        return getListPersonJSONObject().stream()
                .sorted(Comparator.comparing(PersonJSONObject::getHomeTown))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public ArrayList<PersonJSONObject> SortedUpToBirthDate() {
        return getListPersonJSONObject().stream()
                .sorted(Comparator.comparing(PersonJSONObject::getBirthDate))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public ArrayList<PersonJSONObject> SortedDownToName() {
        return getListPersonJSONObject().stream()
                .sorted(Comparator.comparing(PersonJSONObject::getName).reversed())
                .collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public ArrayList<PersonJSONObject> SortedDownToSurname() {
        return getListPersonJSONObject().stream()
                .sorted(Comparator.comparing(PersonJSONObject::getSurname).reversed())
                .collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public ArrayList<PersonJSONObject> SortedDownToSex() {
        return getListPersonJSONObject().stream()
                .sorted(Comparator.comparing(PersonJSONObject::getSex).reversed())
                .collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public ArrayList<PersonJSONObject> SortedDownToHomeTown() {
        return getListPersonJSONObject().stream()
                .sorted(Comparator.comparing(PersonJSONObject::getHomeTown).reversed())
                .collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public ArrayList<PersonJSONObject> SortedDownToBirthDate() {
        return getListPersonJSONObject().stream()
                .sorted(Comparator.comparing(PersonJSONObject::getBirthDate).reversed())
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
