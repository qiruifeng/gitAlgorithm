package jianzhioffer;

import java.util.ArrayList;
import java.util.List;

import static tools.tools.printArrays;

public class ReOrderArray {
    public static void reOrderArray(int[] array) {
        List<Integer> jishu = new ArrayList<>();
        List<Integer> oushu = new ArrayList<>();
        int[] res = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                jishu.add(array[i]);
            } else {
                oushu.add(array[i]);
            }
        }
        int i = 0;
        int m = 0;
        int n = 0;
        while (m<jishu.size()) {

            array[i++] = jishu.get(m++);
        }
        while (n<oushu.size()){
            array[i++]=oushu.get(n++);
        }
        //printArrays(array);
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9};
        reOrderArray(a);
    }
}
