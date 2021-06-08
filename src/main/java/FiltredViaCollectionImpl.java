import org.apache.commons.collections4.CollectionUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Hashtable;

public class FiltredViaCollectionImpl implements Filtred {

    private ArrayList<PersonJSONObject> ListPersonJSONObject;

    public void setListPersonJSONObject(ArrayList<PersonJSONObject> aListPerson) { this.ListPersonJSONObject = aListPerson; }

    private ArrayList<PersonJSONObject> getListPersonJSONObject() { return this.ListPersonJSONObject; }

    public FiltredViaCollectionImpl() {
    }

    public ArrayList<PersonJSONObject> filtredToSurname(String aCompareStr) {

        ArrayList<PersonJSONObject> filtredOriginColl = new ArrayList<>(getListPersonJSONObject());

        CollectionUtils.filter(filtredOriginColl,
                personJSONObject -> aCompareStr.equals(personJSONObject.getSurname()));
        if (filtredOriginColl.size() == 0)
            return new ArrayList<>();

        return filtredOriginColl;
    }


    public ArrayList<PersonJSONObject> filtredToName(String aCompareStr) {
        ArrayList<PersonJSONObject> filtredOriginColl = new ArrayList<>(getListPersonJSONObject());

        CollectionUtils.filter(filtredOriginColl,
                personJSONObject -> aCompareStr.equals(personJSONObject.getName()));
        if (filtredOriginColl.size() == 0)
            return new ArrayList<>();

        return filtredOriginColl;
    }


    public ArrayList<PersonJSONObject> filtredToSex(String aCompareStr) {
        ArrayList<PersonJSONObject> filtredOriginColl = new ArrayList<>(getListPersonJSONObject());

        CollectionUtils.filter(filtredOriginColl,
                personJSONObject -> aCompareStr.equals(personJSONObject.getSex()));
        if (filtredOriginColl.size() == 0)
            return new ArrayList<>();

        return filtredOriginColl;
    }


    public ArrayList<PersonJSONObject> filtredToHomeTown(String aCompareStr) {
        ArrayList<PersonJSONObject> filtredOriginColl = new ArrayList<>(getListPersonJSONObject());

        CollectionUtils.filter(filtredOriginColl,
                personJSONObject -> aCompareStr.equals(personJSONObject.getHomeTown()));
        if (filtredOriginColl.size() == 0)
            return new ArrayList<>();

        return filtredOriginColl;
    }


    public ArrayList<PersonJSONObject> filtredToBirthDate(String aCompareStr) {

        ArrayList<PersonJSONObject> filtredOriginColl = new ArrayList<>(getListPersonJSONObject());

        CollectionUtils.filter(filtredOriginColl,
                personJSONObject -> {
                    if (aCompareStr.length() == 4) {
                        return (personJSONObject.getBirthDate().getYear() == Integer.parseInt(aCompareStr));
                    } else {
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.uuuu");
                        LocalDate ld = LocalDate.parse(aCompareStr, formatter);
                        return ld.compareTo(personJSONObject.getBirthDate()) == 0;
                    }
                });
        if (filtredOriginColl.size() == 0)
            return new ArrayList<>();

        return filtredOriginColl;
    }
}
