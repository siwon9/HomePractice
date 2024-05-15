package exam02;

import java.util.Arrays;
import java.util.List;

public class MyArrays {

    List list = Arrays.asList(1,2,3,4,5); // 원시자료값
    List list2 = Arrays.asList(new Integer[]{1,2,3,4,5}); // Integer 객체배열

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int[] arr2 = Arrays.copyOf(arr,7); // 더 많이추가시키면 0으로 채워진다.
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        char[] chars = new char[10];
        Arrays.fill(chars, '*');
        System.out.println(Arrays.toString(chars));
    }


}
