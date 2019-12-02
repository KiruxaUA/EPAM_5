package ua.epam4;

import ua.epam4.HeightBalancedBST;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class HeightBalancedBSTTest {
    private ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(42, 3, 78, 148, -5));
    private HeightBalancedBST binarySearchTree = new HeightBalancedBST();
    private TreeSet<Integer> treeSet = new TreeSet<Integer>(Arrays.asList(-5, 3, 42, 78, 148));

    @Test
    public void searchTest() {
        assertEquals(treeSet, binarySearchTree.convertArray(input));
    }
}
