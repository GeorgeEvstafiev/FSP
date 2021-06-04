import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class PersonJSONObject implements Comparable<PersonJSONObject> {

    private String Name;
    private String Surname;
    private LocalDate BirthDate;
    //private String BirthDate;
    private String Sex;
    private String HomeTown;
    private ArrayList<PersonJSONObject> ListPersonJSONObject;
    private String pathFile;

    public PersonJSONObject(String aPathFile){
        pathFile = aPathFile;
    }

    public PersonJSONObject(){
    }

    //сеттеры
    private void setBirthDate(String aBirthDate) {
       /* try {
            Date date = new SimpleDateFormat("dd.MM.YYYY").parse(aBirthDate);
            BirthDate = date;
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }*/
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.uuuu");
        BirthDate = LocalDate.parse(aBirthDate, formatter);

        //BirthDate = aBirthDate;
    }

    private void setHomeTown(String aHomeTown) {
        HomeTown = aHomeTown;
    }

    private void setName(String aName) {
        Name = aName;
    }

    private void setSex(String aSex) {
        Sex = aSex;
    }

    private void setSurname(String aSurname) {
        Surname = aSurname;
    }

    //геттеры
    /*public Date getBirthDate() {
        return BirthDate;
    }*/
    public LocalDate getBirthDate() { return BirthDate; }

    public String getHomeTown() { return HomeTown; }

    public String getName() { return Name; }

    public String getSex() { return Sex; }

    public String getSurname() { return Surname; }

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
        return new HashCodeBuilder().append(getSurname().hashCode())
                .append(getName().hashCode())
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
        return new EqualsBuilder().append(this.Surname, other.getSurname())
                .append(this.Name, other.getName())
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
