package ua.epam4;

import ua.epam4.PartitionedList;
import org.junit.Test;
import java.util.Arrays;
import java.util.LinkedList;
import static org.junit.Assert.*;

public class PartitionedListTest {
    private PartitionedList swapper = new PartitionedList();
    private LinkedList<Integer> input = new LinkedList<Integer>(Arrays.asList(1, 2, 4, 3, 2, 5));
    private LinkedList<Integer> expectedResult = new LinkedList<Integer>(Arrays.asList(1, 2, 2, 4, 3, 5));

    @Test
    public void swapperTest() {
        swapper.partitionList(input, 3);
        assertEquals(expectedResult, input);
    }

    @Test
    public void swapperNegateTest() {
        swapper.partitionList(input, 4);
        assertNotEquals(expectedResult, input);
    }
}
