package com.bridgelabz;

/**
 * Refactor all the 3 to One Generic Method and find the maximum
 */

public class GenericMaximumNumber {
    public static void main(String[] args) {
        System.out.println("Maximum String: " +findMaximumString("Pineapple", "Apple", "Banana"));
        System.out.println("Maximum Integer Number: " +findMaximumString(24, 55, 22));
        System.out.println("Maximum Float Number: " +findMaximumString(23.5f, 55.7f, 99.7f));
    }

    /**
     * @param string1
     * @param string2
     * @param string3
     * Used to find the maximum string lexicographically(Dictionary order)
     * of given three numbers using compareTo method
     */
    public static <T extends Comparable> T findMaximumString(T string1, T string2, T string3) {
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
