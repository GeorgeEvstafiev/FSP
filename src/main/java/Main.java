import java.util.ArrayList;
import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {

        if(args.length == 1) {
            //создание коллекци по умолчанию
            PersonJSONObject PJO = new PersonJSONObject(args[0]);
            ArrayList<PersonJSONObject> listPerson = PJO.getPersonJSONObject();

            Hashtable<Integer, String> htFilter = new Hashtable<>();
            htFilter.put(1, "Иванов");
           // htFilter.put(3, "1990");
            Filter filter = new Filter();
            ArrayList<ArrayList<PersonJSONObject>> listFi = filter.getListOfFiltred(listPerson, htFilter, 2);

            Sorted sortColl = new Sorted();
            ArrayList<ArrayList<PersonJSONObject>> listSort = new ArrayList<> ();
            for (ArrayList<PersonJSONObject> list:
                    listFi) {
                sortColl.setListPersonJSONObject(list);
                ArrayList<PersonJSONObject> sortListPerson = sortColl.SortedDown(1);
                listSort.add(sortListPerson);
            }

            Logger.Print(listSort, 2);
        }
    }
}
