import java.util.ArrayList;
import java.util.Collections;

public class SortedViaCollectionImpl implements Sorted{

    private ArrayList<PersonJSONObject> ListPersonJSONObject;

    public void setListPersonJSONObject(ArrayList<PersonJSONObject> aListPersonJSONObject) {
        ListPersonJSONObject = aListPersonJSONObject;
    }

    private ArrayList<PersonJSONObject> getListPersonJSONObject(){
        return ListPersonJSONObject;
    }

    public SortedViaCollectionImpl() {
    }

    @Override
    public ArrayList<PersonJSONObject> SortedUpToSurname() {
        ArrayList<PersonJSONObject> list = new ArrayList<>(getListPersonJSONObject());
        Collections.sort(list, new ComparatorSurname());
        return list;
    }

    @Override
    public ArrayList<PersonJSONObject> SortedUpToSex() {
        ArrayList<PersonJSONObject> list = new ArrayList<>(getListPersonJSONObject());
        Collections.sort(list, new ComparatorSex());
        return list;
    }

    @Override
    public ArrayList<PersonJSONObject> SortedUpToName() {
        ArrayList<PersonJSONObject> list = new ArrayList<>(getListPersonJSONObject());
        Collections.sort(list, new ComparatorName());
        return list;
    }

    @Override
    public ArrayList<PersonJSONObject> SortedUpToHomeTown() {
        ArrayList<PersonJSONObject> list = new ArrayList<>(getListPersonJSONObject());
        Collections.sort(list, new ComparatorHomeTown());
        return list;
    }

    @Override
    public ArrayList<PersonJSONObject> SortedUpToBirthDate() {
        ArrayList<PersonJSONObject> list = new ArrayList<>(getListPersonJSONObject());
        Collections.sort(list, new ComparatorBirthDate());
        return list;
    }

    @Override
    public ArrayList<PersonJSONObject> SortedDownToSurname() {
        ArrayList<PersonJSONObject> list = new ArrayList<>(getListPersonJSONObject());
        Collections.sort(list, new ComparatorSurname().reversed());
        return list;
    }

    @Override
    public ArrayList<PersonJSONObject> SortedDownToSex() {
        ArrayList<PersonJSONObject> list = new ArrayList<>(getListPersonJSONObject());
        Collections.sort(list, new ComparatorSex().reversed());
        return list;
    }

    @Override
    public ArrayList<PersonJSONObject> SortedDownToName() {
        ArrayList<PersonJSONObject> list = new ArrayList<>(getListPersonJSONObject());
        Collections.sort(list, new ComparatorName().reversed());
        return list;
    }

    @Override
    public ArrayList<PersonJSONObject> SortedDownToHomeTown() {
        ArrayList<PersonJSONObject> list = new ArrayList<>(getListPersonJSONObject());
        Collections.sort(list, new ComparatorHomeTown().reversed());
        return list;
    }

    @Override
    public ArrayList<PersonJSONObject> SortedDownToBirthDate() {
        ArrayList<PersonJSONObject> list = new ArrayList<>(getListPersonJSONObject());
        Collections.sort(list, new ComparatorBirthDate().reversed());
        return list;
    }
}
