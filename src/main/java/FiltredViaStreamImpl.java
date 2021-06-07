import org.apache.commons.collections4.CollectionUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class FiltredViaStreamImpl implements Filtred{

    private ArrayList<PersonJSONObject> listPersonJSONObject;

    public void setListPersonJSONObject(ArrayList<PersonJSONObject> aListPerson) { this.listPersonJSONObject = aListPerson; }

    private ArrayList<PersonJSONObject> getListPersonJSONObject() { return this.listPersonJSONObject; }

    public FiltredViaStreamImpl() {
    }

    @Override
    public ArrayList<PersonJSONObject> filtredToSurname(String aCompareStr) {

        ArrayList<PersonJSONObject> filtredOriginColl = listPersonJSONObject.stream().filter(x -> x.getSurname().equals(aCompareStr))
                .collect(Collectors.toCollection(ArrayList::new));
        if (filtredOriginColl.size() == 0)
            return new ArrayList<>();

        return filtredOriginColl;
    }

    @Override
    public ArrayList<PersonJSONObject> filtredToName(String aCompareStr) {

        ArrayList<PersonJSONObject> filtredOriginColl = listPersonJSONObject.stream().filter(x -> x.getName().equals(aCompareStr))
                .collect(Collectors.toCollection(ArrayList::new));
        if (filtredOriginColl.size() == 0)
            return new ArrayList<>();

        return filtredOriginColl;
    }

    @Override
    public ArrayList<PersonJSONObject> filtredToSex(String aCompareStr) {

        ArrayList<PersonJSONObject> filtredOriginColl = listPersonJSONObject.stream().filter(x -> x.getSex().equals(aCompareStr))
                .collect(Collectors.toCollection(ArrayList::new));
        if (filtredOriginColl.size() == 0)
            return new ArrayList<>();

        return filtredOriginColl;
    }

    @Override
    public ArrayList<PersonJSONObject> filtredToHomeTown(String aCompareStr) {

        ArrayList<PersonJSONObject> filtredOriginColl = listPersonJSONObject.stream().filter(x -> x.getHomeTown().equals(aCompareStr))
                .collect(Collectors.toCollection(ArrayList::new));
        if (filtredOriginColl.size() == 0)
            return new ArrayList<>();

        return filtredOriginColl;
    }

    @Override
    public ArrayList<PersonJSONObject> filtredToBirthDate(String aCompareStr) {
        DateTimeFormatter formatter;
        LocalDate birthDate = LocalDate.now();
        if(aCompareStr.length() > 4) {
            formatter = DateTimeFormatter.ofPattern("dd.MM.uuuu");
            birthDate = LocalDate.parse(aCompareStr, formatter);
        }

        LocalDate finalBirthDate = birthDate;
        ArrayList<PersonJSONObject> filtredOriginColl = listPersonJSONObject.stream().filter((x) ->
                        aCompareStr.length() == 4 ? x.getBirthDate().getYear() == Integer.parseInt(aCompareStr) :
                        x.getBirthDate().equals(finalBirthDate))
                        .collect(Collectors.toCollection(ArrayList::new));
        if (filtredOriginColl.size() == 0)
            return new ArrayList<>();

        return filtredOriginColl;
    }
}
