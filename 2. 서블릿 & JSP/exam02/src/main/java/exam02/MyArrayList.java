package exam02;

import java.util.*;
import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(Integer.valueOf(5));
        list1.add(Integer.valueOf(4));
        list1.add(Integer.valueOf(2));
        list1.add(Integer.valueOf(3));
        list1.add(String.valueOf('*'));

        ArrayList list2 = new ArrayList(list1.subList(1,4));

        Collections.sort(list1);
    }
}
