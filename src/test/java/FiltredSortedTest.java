import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Hashtable;

class FiltredSortedTest {

    @Test
    void testSortedViaStreamImplTest() {

        SortedViaStreamImpl sortedViaStream = new SortedViaStreamImpl();
        ArrayList<PersonJSONObject> expected;
        ArrayList<PersonJSONObject> actual;
        //Исходные данные
        sortedViaStream.setListPersonJSONObject(new PersonJSONObject(".\\src\\main\\resources\\repositoryPerson.json").getPersonJSONObject());

        //Данные возвращаемые тестируемым методом
        expected = sortedViaStream.SortedUpToName();
        //Ожидаемые данные при сортировке по Имени (вверх)
        actual = new PersonJSONObject(".\\src\\main\\resources\\ForTests\\sortedUpToName.json").getPersonJSONObject();
        Assertions.assertEquals(expected, actual);

        //Данные возвращаемые тестируемым методом
        expected = sortedViaStream.SortedUpToSurname();
        //Ожидаемые данные при сортировке по Фамилии (вверх)
        actual = new PersonJSONObject(".\\src\\main\\resources\\ForTests\\sortedUpToSurname.json").getPersonJSONObject();
        Assertions.assertEquals(expected, actual);

        //Данные возвращаемые тестируемым методом
        expected = sortedViaStream.SortedUpToSex();
        //Ожидаемые данные при сортировке по Полу (вверх)
        actual = new PersonJSONObject(".\\src\\main\\resources\\ForTests\\sortedUpToSex.json").getPersonJSONObject();
        Assertions.assertEquals(expected, actual);

        //Данные возвращаемые тестируемым методом
        expected = sortedViaStream.SortedUpToBirthDate();
        //Ожидаемые данные при сортировке по Дате рождения (вверх)
        actual = new PersonJSONObject(".\\src\\main\\resources\\ForTests\\sortedUpToBirthDate.json").getPersonJSONObject();
        Assertions.assertEquals(expected, actual);

        //Данные возвращаемые тестируемым методом
        expected = sortedViaStream.SortedUpToHomeTown();
        //Ожидаемые данные при сортировке по Городу (вверх)
        actual = new PersonJSONObject(".\\src\\main\\resources\\ForTests\\sortedUpToHomeTown.json").getPersonJSONObject();
        Assertions.assertEquals(expected, actual);

        //Данные возвращаемые тестируемым методом
        expected = sortedViaStream.SortedDownToName();
        //Ожидаемые данные при сортировке по Имени (вниз)
        actual = new PersonJSONObject(".\\src\\main\\resources\\ForTests\\sortedDownToName.json").getPersonJSONObject();
        Assertions.assertEquals(expected, actual);

        //Данные возвращаемые тестируемым методом
        expected = sortedViaStream.SortedDownToSurname();
        //Ожидаемые данные при сортировке по Фамилии (вниз)
        actual = new PersonJSONObject(".\\src\\main\\resources\\ForTests\\sortedDownToSurname.json").getPersonJSONObject();
        Assertions.assertEquals(expected, actual);

        //Данные возвращаемые тестируемым методом
        expected = sortedViaStream.SortedDownToSex();
        //Ожидаемые данные при сортировке по Полу (вниз)
        actual = new PersonJSONObject(".\\src\\main\\resources\\ForTests\\sortedDownToSex.json").getPersonJSONObject();
        Assertions.assertEquals(expected, actual);

        //Данные возвращаемые тестируемым методом
        expected = sortedViaStream.SortedDownToBirthDate();
        //Ожидаемые данные при сортировке по Дате рождения (вниз)
        actual = new PersonJSONObject(".\\src\\main\\resources\\ForTests\\sortedDownToBirthDate.json").getPersonJSONObject();
        Assertions.assertEquals(expected, actual);

        //Данные возвращаемые тестируемым методом
        expected = sortedViaStream.SortedDownToHomeTown();
        //Ожидаемые данные при сортировке по Городу (вниз)
        actual = new PersonJSONObject(".\\src\\main\\resources\\ForTests\\sortedDownToHomeTown.json").getPersonJSONObject();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSortedViaCollectionImplTest() {
        SortedViaCollectionImpl sortedViaCollection = new SortedViaCollectionImpl();
        ArrayList<PersonJSONObject> expected;
        ArrayList<PersonJSONObject> actual;
        //Исходные данные
        sortedViaCollection.setListPersonJSONObject(new PersonJSONObject(".\\src\\main\\resources\\repositoryPerson.json").getPersonJSONObject());

        //Данные возвращаемые тестируемым методом
        expected = sortedViaCollection.SortedUpToName();
        //Ожидаемые данные при сортировке по Имени (вверх)
        actual = new PersonJSONObject(".\\src\\main\\resources\\ForTests\\sortedUpToName.json").getPersonJSONObject();
        Assertions.assertEquals(expected, actual);

        //Данные возвращаемые тестируемым методом
        expected = sortedViaCollection.SortedUpToSurname();
        //Ожидаемые данные при сортировке по Фамилии (вверх)
        actual = new PersonJSONObject(".\\src\\main\\resources\\ForTests\\sortedUpToSurname.json").getPersonJSONObject();
        Assertions.assertEquals(expected, actual);

        //Данные возвращаемые тестируемым методом
        expected = sortedViaCollection.SortedUpToSex();
        //Ожидаемые данные при сортировке по Полу (вверх)
        actual = new PersonJSONObject(".\\src\\main\\resources\\ForTests\\sortedUpToSex.json").getPersonJSONObject();
        Assertions.assertEquals(expected, actual);

        //Данные возвращаемые тестируемым методом
        expected = sortedViaCollection.SortedUpToBirthDate();
        //Ожидаемые данные при сортировке по Дате рождения (вверх)
        actual = new PersonJSONObject(".\\src\\main\\resources\\ForTests\\sortedUpToBirthDate.json").getPersonJSONObject();
        Assertions.assertEquals(expected, actual);

        //Данные возвращаемые тестируемым методом
        expected = sortedViaCollection.SortedUpToHomeTown();
        //Ожидаемые данные при сортировке по Городу (вверх)
        actual = new PersonJSONObject(".\\src\\main\\resources\\ForTests\\sortedUpToHomeTown.json").getPersonJSONObject();
        Assertions.assertEquals(expected, actual);

        //Данные возвращаемые тестируемым методом
        expected = sortedViaCollection.SortedDownToName();
        //Ожидаемые данные при сортировке по Имени (вниз)
        actual = new PersonJSONObject(".\\src\\main\\resources\\ForTests\\sortedDownToName.json").getPersonJSONObject();
        Assertions.assertEquals(expected, actual);

        //Данные возвращаемые тестируемым методом
        expected = sortedViaCollection.SortedDownToSurname();
        //Ожидаемые данные при сортировке по Фамилии (вниз)
        actual = new PersonJSONObject(".\\src\\main\\resources\\ForTests\\sortedDownToSurname.json").getPersonJSONObject();
        Assertions.assertEquals(expected, actual);

        //Данные возвращаемые тестируемым методом
        expected = sortedViaCollection.SortedDownToSex();
        //Ожидаемые данные при сортировке по Полу (вниз)
        actual = new PersonJSONObject(".\\src\\main\\resources\\ForTests\\sortedDownToSex.json").getPersonJSONObject();
        Assertions.assertEquals(expected, actual);

        //Данные возвращаемые тестируемым методом
        expected = sortedViaCollection.SortedDownToBirthDate();
        //Ожидаемые данные при сортировке по Дате рождения (вниз)
        actual = new PersonJSONObject(".\\src\\main\\resources\\ForTests\\sortedDownToBirthDate.json").getPersonJSONObject();
        Assertions.assertEquals(expected, actual);

        //Данные возвращаемые тестируемым методом
        expected = sortedViaCollection.SortedDownToHomeTown();
        //Ожидаемые данные при сортировке по Городу (вниз)
        actual = new PersonJSONObject(".\\src\\main\\resources\\ForTests\\sortedDownToHomeTown.json").getPersonJSONObject();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testFiltredViaCollectionImplTest() {
        FiltredViaCollectionImpl filtredViaCollection = new FiltredViaCollectionImpl();
        ArrayList<PersonJSONObject> expected;
        ArrayList<PersonJSONObject> actual;
        //Исходные данные
        filtredViaCollection.setListPersonJSONObject(new PersonJSONObject(".\\src\\main\\resources\\repositoryPerson.json").getPersonJSONObject());

        //Данные возвращаемые тестируемым методом
        expected = filtredViaCollection.filtredToName("Иван");
        //Ожидаемые данные при сортировке по Имени
        actual = new PersonJSONObject(".\\src\\main\\resources\\ForTests\\filtredToName.json").getPersonJSONObject();
        Assertions.assertEquals(expected, actual);

        //Данные возвращаемые тестируемым методом
        expected = filtredViaCollection.filtredToSurname("Иванов");
        //Ожидаемые данные при сортировке по Фамилии
        actual = new PersonJSONObject(".\\src\\main\\resources\\ForTests\\filtredToSurname.json").getPersonJSONObject();
        Assertions.assertEquals(expected, actual);

        //Данные возвращаемые тестируемым методом
        expected = filtredViaCollection.filtredToSex("female");
        //Ожидаемые данные при сортировке по Полу
        actual = new PersonJSONObject(".\\src\\main\\resources\\ForTests\\filtredToSex.json").getPersonJSONObject();
        Assertions.assertEquals(expected, actual);

        //Данные возвращаемые тестируемым методом
        expected = filtredViaCollection.filtredToHomeTown("Таганрог");
        //Ожидаемые данные при сортировке по Городу
        actual = new PersonJSONObject(".\\src\\main\\resources\\ForTests\\filtredToHomeTown.json").getPersonJSONObject();
        Assertions.assertEquals(expected, actual);

        //Данные возвращаемые тестируемым методом
        expected = filtredViaCollection.filtredToBirthDate("1990");
        //Ожидаемые данные при сортировке по Дате рождения
        actual = new PersonJSONObject(".\\src\\main\\resources\\ForTests\\filtredToBirthDate.json").getPersonJSONObject();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testFiltredViaStreamImplTest() {
        FiltredViaStream filtredViaStream = new FiltredViaStream();
        ArrayList<PersonJSONObject> expected;
        ArrayList<PersonJSONObject> actual;
        //Исходные данные
        filtredViaStream.setListPersonJSONObject(new PersonJSONObject(".\\src\\main\\resources\\repositoryPerson.json").getPersonJSONObject());

        Hashtable htFiltred = new Hashtable();
        htFiltred.put("birthdate", "1990");
        htFiltred.put("surname", "Иванов");

        //Данные возвращаемые тестируемым методом
        expected = filtredViaStream.filtredToAllFields(htFiltred);
        //Ожидаемые данные при фильтрации по Имени и Дате рождения
        actual = new PersonJSONObject(".\\src\\main\\resources\\ForTests\\filtredToNameAndBirthDate.json").getPersonJSONObject();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCommon() {
        FiltredViaStream filtredViaStream = new FiltredViaStream();
        SortedViaStreamImpl sortedViaStream = new SortedViaStreamImpl();
        ArrayList<PersonJSONObject> expected;
        ArrayList<PersonJSONObject> actual;
        //Исходные данные
        ArrayList<PersonJSONObject> listPerson = new PersonJSONObject(".\\src\\main\\resources\\repositoryPerson.json").getPersonJSONObject();

        filtredViaStream.setListPersonJSONObject(listPerson);

        Hashtable htFiltred = new Hashtable();
        htFiltred.put("name", "Иван");
        htFiltred.put("surname", "Иванов");

        //Данные возвращаемые тестируемым методом фильтрация по имени и фамилии
        expected = filtredViaStream.filtredToAllFields(htFiltred);

        sortedViaStream.setListPersonJSONObject(expected);
        //Данные возвращаемые тестируемым методом обратная сортировка по дате рождения
        expected = sortedViaStream.SortedDownToBirthDate();
        //Ожидаемые данные при комплексном тесте
        actual = new PersonJSONObject(".\\src\\main\\resources\\ForTests\\testCommon.json").getPersonJSONObject();

        Assertions.assertEquals(expected, actual);

        //визуальная проверка работы режима пагинации
        Logger.Print(Paganation.getListOfPaganation(expected, 1), 2);
    }
}