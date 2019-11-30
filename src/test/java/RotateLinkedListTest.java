import ua.epam4.RotateLinkedList;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import static org.junit.Assert.*;

public class RotateLinkedListTest {
    private RotateLinkedList linkedListRotator = new RotateLinkedList();
    private LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
    private LinkedList<Integer> result = new LinkedList<Integer>(Arrays.asList(4, 5, 1, 2, 3));;

    @Test
    public void rotateRightTest() {
        linkedListRotator.rotateLinkedList(list, 2);
        assertEquals(result, list);
    }

    @Test
    public void negateTest() {
        linkedListRotator.rotateLinkedList(list, 3);
        assertNotEquals(result, list);
    }
}
