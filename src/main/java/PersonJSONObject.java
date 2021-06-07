import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class PersonJSONObject implements Comparable<PersonJSONObject> {

    private String Name;
    private String Surname;
    private LocalDate BirthDate;
    private String Sex;
    private String HomeTown;
    private ArrayList<PersonJSONObject> ListPersonJSONObject;
    private String pathFile;

    public PersonJSONObject(String aPathFile){
        pathFile = aPathFile;
    }

    public PersonJSONObject(){
    }

    public PersonJSONObject(String aName, String aSurname, String aBirthDate, String aSex, String aHomeTown) {
        Name = aName;
        Surname = aSurname;
        setBirthDate(aBirthDate);
        Sex = aSex;
        HomeTown = aHomeTown;
    }

    //сеттеры
    public void setBirthDate(String aBirthDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.uuuu");
        BirthDate = LocalDate.parse(aBirthDate, formatter);
    }

    public void setHomeTown(String aHomeTown) {
        this.HomeTown = aHomeTown;
    }

    public void setName(String aName) {
        this.Name = aName;
    }

    public void setSex(String aSex) {
        this.Sex = aSex;
    }

    public void setSurname(String aSurname) {
        this.Surname = aSurname;
    }

    //геттеры
    public LocalDate getBirthDate() { return this.BirthDate; }

    public String getHomeTown() { return this.HomeTown; }

    public String getName() { return this.Name; }

    public String getSex() { return this.Sex; }

    public String getSurname() { return this.Surname; }

    public ArrayList<PersonJSONObject> getPersonJSONObject() {
        if(ListPersonJSONObject == null) {
            ListPersonJSONObject = new ArrayList<>();
            ReadJSONFile();
        }
        else {
            ReadJSONFile();
        }
        return ListPersonJSONObject;
    }

    @Override
    public int hashCode()
    {
        return new HashCodeBuilder().append(getName().hashCode())
                .append(getSurname().hashCode())
                .append(((Integer)getBirthDate().getYear()).hashCode())
                .append(getBirthDate().getMonth().hashCode())
                .append(((Integer)getBirthDate().getDayOfMonth()).hashCode())
                .append(getSex().hashCode())
                .append(getHomeTown().hashCode())
                .toHashCode();
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        PersonJSONObject other = (PersonJSONObject) obj;
        return new EqualsBuilder().append(this.Name, other.getName())
                .append(this.Surname, other.getSurname())
                .append(this.BirthDate.getYear(), other.getBirthDate().getYear())
                .append(this.BirthDate.getMonth(), other.getBirthDate().getMonth())
                .append(this.BirthDate.getDayOfMonth(), other.getBirthDate().getDayOfMonth())
                .append(this.Sex, other.getSex())
                .append(this.HomeTown, other.getHomeTown())
                .isEquals();
    }


    private ArrayList<PersonJSONObject> ReadJSONFile()
    {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader(pathFile));

            JSONObject jsonObject = (JSONObject) obj;

            JSONArray jsonObjectPerson = (JSONArray) jsonObject.get("Person");

            if (jsonObjectPerson != null) {
                jsonObjectPerson.forEach(issueNode -> {

                    PersonJSONObject itemPerson = new PersonJSONObject();

                    JSONObject issue = (JSONObject) issueNode;
                    itemPerson.setName((String) issue.get("Name"));
                    itemPerson.setHomeTown((String) issue.get("HomeTown"));
                    itemPerson.setSex((String) issue.get("Sex"));
                    itemPerson.setSurname((String) issue.get("Surname"));
                    itemPerson.setBirthDate((String) issue.get("BirthDate"));

                    ListPersonJSONObject.add(itemPerson);

                });
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return ListPersonJSONObject;
    }

    @Override
    public int compareTo(PersonJSONObject o) {
        return 0;
    }
}
