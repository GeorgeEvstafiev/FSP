import java.util.ArrayList;

public class Logger {

    public Logger(){
    }

    private static void PrintLog(ArrayList<PersonJSONObject> aListPerson) {
        StringBuilder SB = new StringBuilder();
        aListPerson.forEach(item -> {
            SB.append("Фамилия: ").append(item.getSurname()).append(" ");
            SB.append("Имя: ").append(item.getName()).append(" ");
            SB.append("Дата рождения: ").append(item.getBirthDate()).append(" ");
            SB.append("Пол: ").append(item.getSex()).append(" ");
            SB.append("Прописка: ").append(item.getHomeTown()).append(" ");
            SB.append("\n");
        });
        System.out.println(SB);
    }

    public static void Print(ArrayList<ArrayList<PersonJSONObject>> aListPerson,
                             int aPageNumber) {
        if(aListPerson.size() > 0) {
            if(aPageNumber == -1) {
                for (ArrayList<PersonJSONObject> list:
                        aListPerson) {
                    PrintLog(list);
                }
            }
            else {
                if(aPageNumber == 1)
                    PrintLog(aListPerson.get(aPageNumber));
                else
                    if(aPageNumber > 1)
                        PrintLog(aListPerson.get(aPageNumber - 1));
            }
        }
    }
}

