import java.util.ArrayList;

public interface Sorted {

    <T> ArrayList<T> SortedUpToName();
    <T> ArrayList<T> SortedUpToSurname();
    <T> ArrayList<T> SortedUpToSex();
    <T> ArrayList<T> SortedUpToHomeTown();
    <T> ArrayList<T> SortedUpToBirthDate();

    <T> ArrayList<T> SortedDownToName();
    <T> ArrayList<T> SortedDownToSurname();
    <T> ArrayList<T> SortedDownToSex();
    <T> ArrayList<T> SortedDownToHomeTown();
    <T> ArrayList<T> SortedDownToBirthDate();
}
