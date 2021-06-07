import java.util.ArrayList;

public class Logger {

    public Logger(){
    }

    private static void PrintLog(ArrayList<PersonJSONObject> aListPerson) {
        StringBuilder SB = new StringBuilder();
        aListPerson.forEach(item -> {
            SB.append("Фамилия: ").append(item.getSurname()).append(" ").append("\n");
            SB.append("Имя: ").append(item.getName()).append(" ").append("\n");
            SB.append("Дата рождения: ").append(item.getBirthDate()).append(" ").append("\n");
            SB.append("Пол: ").append(item.getSex()).append(" ").append("\n");
            SB.append("Прописка: ").append(item.getHomeTown()).append(" ").append("\n");
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
                if(aPageNumber >= 1)
                    PrintLog(aListPerson.get(aPageNumber - 1));
            }
        }
        else
            System.out.println("Нет данных, удовлетвояющих условию фильтра");
    }
}

