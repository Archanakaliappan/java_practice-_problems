package Hashing_arrays;
/*
Find the length of the longest consecutive sequence.
Example[100,4,200,1,3,2]
Consecutive sequence:1,2,3,4
Length:4
Output:4
*/
import java.util.*;
public class long_consective_sequence {
      public static void main(String args[]) {

        int arr[] = {100,4,5,400,3,2,600,500,1};

        HashSet<Integer> set = new HashSet<>();

        // Step 1: Insert all elements into HashSet
        for(int i : arr) {

            set.add(i);

        }

        int max = 0;

        // Step 2: Check for sequence starting points
        for(int j : arr) {

            // If previous number does not exist,
            // then j is a starting point
            if(!set.contains(j - 1)) {

                int current = j;

                int count = 1;

                // Step 3: Count consecutive sequence
                while(set.contains(current + 1)) {

                    current++;

                    count++;

                }

                // Step 4: Update maximum length
                max = Math.max(max, count);

            }
        }

        System.out.println("Longest Consecutive Sequence Length: " + max);

    }
}

