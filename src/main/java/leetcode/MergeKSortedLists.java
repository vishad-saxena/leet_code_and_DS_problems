package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeKSortedLists {
    public static void main(String[] args) {
        Integer arr[] = {1,23,12,9,30,2,50};
        List<Integer> list=Arrays.asList(arr);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if(i==j)return 0;
                if(i>j) return -1;
                else return 1;
            }
        });
        for (Integer i:list) {
            System.out.println(i);
        }
    }
}
