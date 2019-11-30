package ua.epam4;

import java.util.*;

public class HeightBalancedBST {
    public TreeSet<Integer> convertArray(ArrayList<Integer> arrayList) {
        if (arrayList != null) {
            Collections.sort(arrayList);
            return new TreeSet<Integer>(arrayList);
        }

        return new TreeSet<Integer>();
    }
}
