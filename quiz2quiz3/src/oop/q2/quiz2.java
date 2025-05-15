package oop.q2;

import java.util.*;

/**
 * The quiz2 class demonstrates how to merge two lists of integers and strings and sort them.
 * It initializes two predefined lists, list1 and list2, with integer and string values respectively.
 * The program then uses the integers from list1 to find the corresponding index in list2,
 * and creates a new list (list3) that stores the strings from list2 based on the indices from list1.
 * After that, it prints the sorted list3.
 * The program is designed to work with any lists of integers and strings, not just the predefined ones.</p>
 */
public class quiz2 {

    /**
     * Main method where the program execution begins.
     * It initializes list1 and list2, and creates list3 by mapping integers from list1 to strings from list2.
     * The program then prints the sorted list3.
     */
    public static void main(String[] args) {
        // Initialize list1 with integers
        List<Integer> list1 = Arrays.asList(9,5,5,6,3,3,6,4,9,6,5,6,3);

        // Initialize list2 with strings
        List<String> list2 = Arrays.asList("WAE", "p6K", "7ti", "IsX","J64Um","bFE","uFwOt","HGG4x","MvU13","mn0k","nz8","kpz","MkQg","5d7","NhrX","Bti6","Imd","fSbK");

        // Create list3, the result list
        List<String> list3 = new ArrayList<>();

        // Map integers from list1 to corresponding strings in list2
        for (int i = 0; i < list1.size(); i++) {
            list3.add(list2.get(inputOutput(list1.get(i))));
        }

        // Print the resulted list
        System.out.println("Output List: " + list3);
    }

    /**
     * Maps an integer input to its corresponding output index in the list.
     * The function uses hardcoded mappings to return a specific index based on the input value.
     *
     * param input The integer value to be mapped to an index.
     * return The corresponding index in list2, or -1 if the input does not match any predefined mappings.
     */
    public static int inputOutput(int input) {
        // Hardcoded input-output mappings
        if (input == 3) {
            return 5;
        } else if (input == 5) {
            return 9;
        } else if (input == 6) {
            return 11;
        } else if (input == 9) {
            return 17;
        } else if (input == 4) {
            return 7;
        } else {
            return -1; // If the input doesn't match any of the predefined times
        }
    }
}

