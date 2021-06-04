import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Sorted {

    private ArrayList<PersonJSONObject> ListPersonJSONObject;

    public void setListPersonJSONObject(ArrayList<PersonJSONObject> aListPersonJSONObject) {
        ListPersonJSONObject = aListPersonJSONObject;
    }

    private ArrayList<PersonJSONObject> getListPersonJSONObject(){
        return ListPersonJSONObject;
    }

    public Sorted() {
    }

    public ArrayList<PersonJSONObject> SortedUp(int aTypeSort) {

        ArrayList<PersonJSONObject> list = new ArrayList<>(getListPersonJSONObject());

        switch (aTypeSort) {
            case 1 -> //сортировка по имени
                    Collections.sort(list, new ComparatorName());
            case 2 -> //сортировка по фамилии
                    Collections.sort(list, new ComparatorSurname());
            case 3 -> //сортировка по полу
                    Collections.sort(list, new ComparatorSex());
            case 4 -> //сортировка по городу
                    Collections.sort(list, new ComparatorHomeTown());
            case 5 -> //сортировка по дате рождения
                    Collections.sort(list, new ComparatorBirthDate());
        }
        return list;
    }

    public ArrayList<PersonJSONObject> SortedDown(int aTypeSort) {

        ArrayList<PersonJSONObject> list = new ArrayList<>(getListPersonJSONObject());

        switch (aTypeSort) {
            case 1 -> Collections.sort(list, new ComparatorName().reversed());
            case 2 -> Collections.sort(list, new ComparatorSurname().reversed());
            case 3 -> Collections.sort(list, new ComparatorSex().reversed());
            case 4 -> Collections.sort(list, new ComparatorHomeTown().reversed());
            case 5 -> Collections.sort(list, new ComparatorBirthDate().reversed());
        }
        return list;
    }
}
