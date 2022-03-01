package com.bridgelabz;

import java.util.Arrays;

/**
 * Extend the Max method to take  more than 3 parameters
 */

public class GenericMaximumNumber<T extends Comparable> {

    private T[] input1;

    /**
     * @param inputParams using var args...
     */
    GenericMaximumNumber(T... inputParams) {
        this.input1 = inputParams;
    }

    public static void main(String[] args) {
        GenericMaximumNumber<Integer> maximumIntegerNumber = new GenericMaximumNumber(12, 5, 7, 55);
        maximumIntegerNumber.testMaximum();
        GenericMaximumNumber<Float> maximumFloatNumber = new GenericMaximumNumber(12.4f, 55.6f, 7.8f, 78.4f);
        maximumFloatNumber.testMaximum();
        GenericMaximumNumber<String> maximumStringNumber = new GenericMaximumNumber("Banana", "Apple", "Peach", "Gua", "Pomegranate");
        maximumStringNumber.testMaximum();
    }

    private void testMaximum() {
        testMaximum(input1);
    }

    /**
     * @param input1
     * @param <T>    Performing sorting and printing the maximum
     */
    public static <T extends Comparable> void testMaximum(T... input1) {
        Arrays.sort(input1);
        System.out.println(("Maximum: " +input1[input1.length - 1]));
    }
}



