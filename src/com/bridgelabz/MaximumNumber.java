package com.bridgelabz;

/**
 * Given three strings find the maximum
 */

public class MaximumNumber{
    public static void main(String[] args) {
        System.out.println("Maximum String: " +findMaximumString("Pineapple", "Apple", "Banana"));
        System.out.println("Maximum String: " +findMaximumString("Apple", "Pineapple", "Banana"));
        System.out.println("Maximum String: " +findMaximumString("Banana", "Apple", "Pineapple"));
    }

    /**
     * @param string1
     * @param string2
     * @param string3
     * Used to find the maximum string lexicographically(Dictionary order)
     * of given three numbers using compareTo method
     */
    private static String findMaximumString(String string1, String string2, String  string3) {
        if((string1.compareTo(string2) > 0) && (string1.compareTo(string3) > 0))
        {
            return string1;

        }else if((string2.compareTo(string1) > 0) && (string2.compareTo(string3) > 0))
        {
            return string2;
        }
        else{
            return string3;
        }
    }
}
