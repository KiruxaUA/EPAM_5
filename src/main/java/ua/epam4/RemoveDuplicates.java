package ua.epam4;

import java.util.LinkedList;

public class RemoveDuplicates {
    public int removeDuplicates(LinkedList<Integer> linkedList) {
        if (linkedList == null) {
            return 0;
        }
        for (int i = 0; i < linkedList.size()-1 ; i++) {
            if (linkedList.get(i).equals(linkedList.get(i+1))) {
                linkedList.remove(i);
                i--;
            }
        }
        return linkedList.size();
    }
}
