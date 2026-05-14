package Hashing_arrays;

import java.util.*;

/*
find the frequency of each element in the array using hash map
ex=> arr=[1,2,3,4,5,1,2,3], output= 1-2,2-2,3-2,4-1,5-1
*/

public class frequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 3};
    
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}