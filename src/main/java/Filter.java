import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

public class Filter extends Paganation {

    public Filter(){
    }

    public ArrayList<ArrayList<PersonJSONObject>> getListOfFiltred(ArrayList<PersonJSONObject> aOriginColl,
                                               Hashtable<Integer, String> aHtFilter, int aSizePage) {
        ArrayList<PersonJSONObject> listFi = Filtred(aOriginColl, aHtFilter);
        ArrayList<ArrayList<PersonJSONObject>> result = new ArrayList<>();
        if(listFi != null) {
            if(listFi.size() < aSizePage) {
                result.add(listFi);
                return result;
            }
            else {
                if(listFi.size() > aSizePage) {
                    result = toChunk(listFi, aSizePage);
                }
            }
        }

        return result;
    }

    private ArrayList<PersonJSONObject> Filtred(ArrayList<PersonJSONObject> aOriginColl,
                                               Hashtable<Integer, String> aHtFilter) {

        ArrayList<PersonJSONObject> filtredOriginColl = new ArrayList<>(aOriginColl);

        while (aHtFilter.keys().hasMoreElements()) {
            switch (aHtFilter.keys().nextElement()) {
                case 1 -> {
                    CollectionUtils.filter(filtredOriginColl,
                            personJSONObject -> Arrays.asList(aHtFilter.get(1)).contains(personJSONObject.getSurname()));
                    if (filtredOriginColl.size() == 0)
                        return null;
                    aHtFilter.remove(1, aHtFilter.get(1));
                    filtredOriginColl = Filtred(filtredOriginColl, aHtFilter);
                }
                case 2 -> {
                    CollectionUtils.filter(filtredOriginColl,
                            personJSONObject -> Arrays.asList(aHtFilter.get(2)).contains(personJSONObject.getName()));
                    if (filtredOriginColl.size() == 0)
                        return null;
                    aHtFilter.remove(2, aHtFilter.get(2));
                    filtredOriginColl = Filtred(filtredOriginColl, aHtFilter);
                }
                case 3 -> {
                    CollectionUtils.filter(filtredOriginColl,
                            personJSONObject -> {
                                if (aHtFilter.get(3).length() == 4) {
                                    return (personJSONObject.getBirthDate().getYear() == Integer.parseInt(aHtFilter.get(3)));
                                } else {
                                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.uuuu");
                                    LocalDate ld = LocalDate.parse(aHtFilter.get(3), formatter);
                                    return Arrays.asList(ld).contains(personJSONObject.getBirthDate());
                                }
                            });
                    if (filtredOriginColl.size() == 0)
                        return null;
                    aHtFilter.remove(3, aHtFilter.get(3));
                    filtredOriginColl = Filtred(filtredOriginColl, aHtFilter);
                }
                case 4 -> {
                    CollectionUtils.filter(filtredOriginColl,
                            personJSONObject -> Arrays.asList(aHtFilter.get(4)).contains(personJSONObject.getSex()));
                    if (filtredOriginColl.size() == 0)
                        return null;
                    aHtFilter.remove(4, aHtFilter.get(4));
                    filtredOriginColl = Filtred(filtredOriginColl, aHtFilter);
                }
                case 5 -> {
                    CollectionUtils.filter(filtredOriginColl,
                            personJSONObject -> Arrays.asList(aHtFilter.get(5)).contains(personJSONObject.getHomeTown()));
                    if (filtredOriginColl.size() == 0)
                        return null;
                    aHtFilter.remove(5, aHtFilter.get(5));
                    filtredOriginColl = Filtred(filtredOriginColl, aHtFilter);
                }
            }
        }
        return filtredOriginColl;
    }
}
