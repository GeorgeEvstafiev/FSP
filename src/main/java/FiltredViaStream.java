import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.stream.Collectors;

public class FiltredViaStream {

    private ArrayList<PersonJSONObject> listPersonJSONObject;

    public void setListPersonJSONObject(ArrayList<PersonJSONObject> aListPerson) { this.listPersonJSONObject = aListPerson; }

    private ArrayList<PersonJSONObject> getListPersonJSONObject() { return this.listPersonJSONObject; }

    public FiltredViaStream() {
    }

    public ArrayList<PersonJSONObject> filtredToAllFields(@NotNull Hashtable aFiltredRequest) {

        ArrayList<PersonJSONObject> filtredOriginColl = listPersonJSONObject.stream()
                .filter(aFiltredRequest.get("name") != null ? x -> x.getName().equals(aFiltredRequest.get("name")) : x -> true)
                .filter(aFiltredRequest.get("surname") != null ? x -> x.getSurname().equals(aFiltredRequest.get("surname")) : x -> true)
                .filter(aFiltredRequest.get("sex") != null ? x -> x.getSex().equals(aFiltredRequest.get("sex")) : x -> true)
                .filter(aFiltredRequest.get("hometown") != null ? x -> x.getHomeTown().equals(aFiltredRequest.get("hometown")) : x -> true)
                .filter(aFiltredRequest.get("birthdate") != null ? x -> ((String) aFiltredRequest.get("birthdate")).length() == 4 ?
                        x.getBirthDate().getYear() == Integer.parseInt((String) aFiltredRequest.get("birthdate")) :
                        x.getBirthDate().equals(LocalDate.parse((String)aFiltredRequest.get("birthdate"), DateTimeFormatter.ofPattern("dd.MM.uuuu"))) : x -> true)
                .collect(Collectors.toCollection(ArrayList::new));

        if (filtredOriginColl.size() == 0)
            return new ArrayList<>();

        return filtredOriginColl;
    }
}
