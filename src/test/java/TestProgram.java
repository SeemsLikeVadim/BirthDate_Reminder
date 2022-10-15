import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class TestProgram {

    @Test
    void testFriendSearch1(){
        List<Friend> list = new ArrayList<>();
        list.add(new Friend("Даня", LocalDate.of(2002,4,16)));
        list.add(new Friend("Алёна", LocalDate.of(2002,4,16)));
        Assertions.assertEquals(null, Main.friendSearch(LocalDate.of(2002, 4, 16)));
    }
    @Test
    void testFriendSearch2(){
        List<Friend> list = new ArrayList<>();
        list.add(new Friend("Даня", LocalDate.of(2002,4,16)));
        list.add(new Friend("Алёна", LocalDate.of(2002,4,16)));
        Assertions.assertEquals(new ArrayList<Friend>(), Main.friendSearch(LocalDate.of(2002, 5, 16)));
    }
    @Test
    void testFriendSearch3(){
        List<Friend> list = new ArrayList<>();
        list.add(new Friend("Максим", LocalDate.of(2003,4,14)));
        Assertions.assertEquals(list, Main.friendSearch(LocalDate.of(2003,4,14)));
    }
}
