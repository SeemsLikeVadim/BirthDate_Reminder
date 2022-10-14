import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestProgram {

    @Test
    void testFriendSearch(){
        List<Friend> list = new ArrayList<>();
        list.add(new Friend("Даня", LocalDate.of(2002,4,16)));
        list.add(new Friend("Алёна", LocalDate.of(2002,4,16)));

        Assertions.assertEquals(list, Main.friendSearch(LocalDate.of(2002, 4, 16)));
    }
}
