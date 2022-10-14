import java.time.LocalDate;
import java.util.List;

public class Main {
    public static List<Friend> friendSearch(LocalDate date){
        return FriendFactory.friendList.stream().filter(friend -> friend.getDateOfBirh().equals(date)).toList();
    }



    public static void main(String[] args) {

    }

}
