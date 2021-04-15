package ru.job4j.streram;

import org.junit.Test;
import java.util.List;
import java.util.Map;
import static org.junit.Assert.*;

public class GroupMethodTest {

    @Test
    public void groupBy() {

        GroupMethod.User gr1 = new GroupMethod.User("Roman", 10);
        GroupMethod.User gr2 = new GroupMethod.User("Evgen", 10);
        GroupMethod.User gr3 = new GroupMethod.User("Sergey", 30);
        GroupMethod.User gr4 = new GroupMethod.User("Sasha", 30);
        GroupMethod.User gr5 = new GroupMethod.User("Alexey", 50);

        Map<Integer, List<GroupMethod.User>> except = Map.of(
                10, List.of(gr1, gr2),
                30, List.of(gr3,gr4),
                50, List.of(gr5)
        );
        assertEquals(except, GroupMethod.groupBy(List.of(gr1, gr2, gr3, gr4,gr5)));

    }
}