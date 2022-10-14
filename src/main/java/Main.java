import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Friend> friendSearch(LocalDate date){
        return FriendFactory.friendList
                .stream()
                .filter(n -> n.getDateOfBirh().getDayOfMonth() == date.getDayOfMonth() && n.getDateOfBirh().getMonthValue() == date.getMonthValue())
                .toList();
    }


    public static void main(String[] args){
        LocalDate today = LocalDate.now();
        List<Friend> list = friendSearch(today);
        System.out.println("Сегодняшняя дата - " + today);
        if(list.size() == 0){
            System.out.println("Сегодня ни у кого нет Дня Рождения");
        }
        else {
            System.out.println("Сегодня День Рождения у " + list);
        }
    }
}
