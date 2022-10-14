import java.time.LocalDate;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class FriendFactory {
    public static List<Friend> friendList = initializeList();
    private static List<Friend> initializeList(){
        List<Friend> localList = new ArrayList<Friend>();
        localList.add(new Friend("Гриша", LocalDate.of(2002,12,10)));
        localList.add(new Friend("Андрей", LocalDate.of(2002,8,2)));
        localList.add(new Friend("Вадим", LocalDate.of(2002,5,8)));
        localList.add(new Friend("Саша", LocalDate.of(2002,9,27)));
        localList.add(new Friend("Даня", LocalDate.of(2002,4,16)));
        localList.add(new Friend("Паша", LocalDate.of(2002,3,18)));
        localList.add(new Friend("Максим", LocalDate.of(2003,4,14)));
        localList.add(new Friend("Алёна", LocalDate.of(2002,4,16)));
        localList.add(new Friend("Алина", LocalDate.of(2002,10,14)));
        return localList;
    }
}
