package Interface;

import java.util.ArrayList;

public interface Filtred {
    <T> ArrayList<T> filtredToSurname(String aCompareStr);
    <T> ArrayList<T> filtredToName(String aCompareStr);
    <T> ArrayList<T> filtredToSex(String aCompareStr);
    <T> ArrayList<T> filtredToHomeTown(String aCompareStr);
    <T> ArrayList<T> filtredToBirthDate(String aCompareStr);
}
