package Hashing_arrays;
/*
two sum:
check the sum of 2 elements in a array is reultting the tagrget elemnt or not
ex={1,2,3,4,6}
t=8
op:yes(2+6=8)
*/

import java.util.*;

public class two_sum {
    public static void main(String args[]) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int arr[] = {1,2,3,4};

        int t = 6;

        for(int i = 0; i < arr.length; i++) {

            int c = t - arr[i];

            if(map.containsKey(c)) {

                System.out.println(map.get(c) + "," + i);

            }
            else {

                map.put(arr[i], i);

            }
        }
    }
}
