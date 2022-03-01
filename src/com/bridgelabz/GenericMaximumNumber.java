package com.bridgelabz;

import java.util.Arrays;

/**
 * Extend the Max method to take  more than 3 parameters
 */

public class GenericMaximumNumber<T extends Comparable> {

    private T[] input1;

    GenericMaximumNumber(T... inputParams) {
        this.input1 = inputParams;
    }

    public static void main(String[] args) {
        GenericMaximumNumber<Integer> maximumIntegerNumber = new GenericMaximumNumber(12, 5, 7);
        maximumIntegerNumber.testMaximum();
        GenericMaximumNumber<Float> maximumFloatNumber = new GenericMaximumNumber(12.4f, 55.6f, 7.8f, 78.4f);
        maximumFloatNumber.testMaximum();
        GenericMaximumNumber<String> maximumStringNumber = new GenericMaximumNumber("Banana", "Apple", "Peach", "Gua", "Pomogranite");
        maximumStringNumber.testMaximum();
    }

    private void testMaximum() {
        testMaximum(input1);
    }

    /**
     * Used to find the maximum string lexicographically(Dictionary order)
     * of given three strings and max number from 3 numbers using compareTo method
     * and call printMax method internally
     */
    public static <T extends Comparable> void testMaximum(T... input1) {
        Arrays.sort(input1);
        printMax(input1[input1.length-1]);
    }

    /**
     * @param input
     * @param <T>
     */
    public static <T> void printMax(T input) {
        System.out.println("Maximum: " + input);
    }
}
