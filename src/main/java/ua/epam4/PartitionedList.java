package ua.epam4;

import java.util.LinkedList;

public class PartitionedList {
    public LinkedList partitionList(LinkedList<Integer> linkedList, int limitNumber) {
        if (linkedList == null) {
            return new LinkedList();
        }
        int indexOfLimitNumber = linkedList.indexOf(limitNumber);
        int temp;
        for (int i = indexOfLimitNumber; i < linkedList.size()-1; i++) {
            if (linkedList.get(i + 1) <= limitNumber) {
                temp = linkedList.remove(i + 1);
                for (int j = 0; j < linkedList.indexOf(limitNumber); j++) {
                    if (linkedList.get(j) >= temp) {
                        linkedList.add(j, temp);
                        break;
                    }
                }
            }
        }
        return linkedList;
    }
}
