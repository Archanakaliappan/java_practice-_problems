package Hashing_arrays;

import java.util.*;

/*
find the first non repetive element in the array using hash map
ex=> arr=[4,5,1,2,1,4], output= 5
*/
public class nonreptivie_fst_occurance {
    public static void main(String[] args) {
    
    HashMap<Integer, Integer> map = new HashMap<>();

        int arr[] = {4,5,1,2,1,4};


        // Step 1: Count frequency
        for(int i : arr) {

            map.put(i, map.getOrDefault(i, 0) + 1);

        }

        // Step 2: Find first non-repeating element
        for(int i : arr) {

            if(map.get(i) == 1) {

                System.out.println("First Non-Repeating Element: " + i);
                return;

            }

        }

    

    }
}

