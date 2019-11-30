import ua.epam4.RemoveDuplicates;
import org.junit.Test;
import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class RemoveDuplicatesTest {
    private RemoveDuplicates remover = new RemoveDuplicates();
    private LinkedList<Integer> input = new LinkedList<Integer>(Arrays.asList(0, 0, 1, 1, 1, 2, 2, 3, 3, 4));
    private int expected = 5;

    @Test
    public void duplicateRemoveUtilTest() {
        assertEquals(expected, remover.removeDuplicates(input));
    }
}
