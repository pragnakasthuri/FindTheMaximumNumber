package com.bridgelabz;

/**
 * Write printMax Generic Method which is internally called from testMaximum
 */

public class GenericMaximumNumber<T extends Comparable, U extends Comparable, V extends Comparable> {

    private T input1;
    private U input2;
    private V input3;

    GenericMaximumNumber(T input1, U input2, V input3) {
        this.input1 = input1;
        this.input2 = input2;
        this.input3 = input3;
    }

    public static void main(String[] args) {
        GenericMaximumNumber<Integer, Integer, Integer> maximumIntegerNumber = new GenericMaximumNumber(12, 5, 7);
        maximumIntegerNumber.testMaximum();
        GenericMaximumNumber<Float, Float, Float> maximumFloatNumber = new GenericMaximumNumber(12.4f, 55.6f, 7.8f);
        maximumFloatNumber.testMaximum();
        GenericMaximumNumber<String, String, String> maximumStringNumber = new GenericMaximumNumber("Banana", "Apple", "Peach");
        maximumStringNumber.testMaximum();
    }

    private void testMaximum() {
        testMaximum(input1, input2, input3);
    }

    /**
     * Used to find the maximum string lexicographically(Dictionary order)
     * of given three strings and max number from 3 numbers using compareTo method
     * and call printMax method internally
     */
    public static <T extends Comparable, U extends Comparable, V extends Comparable> void testMaximum(T input1, U input2, V input3) {
        if((input1.compareTo(input2) > 0) && (input1.compareTo(input3) > 0))
        {
           printMax(input1);
        } else if((input2.compareTo(input1) > 0) && (input2.compareTo(input3) > 0))
        {
            printMax(input2);
        } else{
            printMax(input3);
        }
    }

    /**
     * @param input
     * @param <T>
     */
    public static <T> void printMax(T input) {
        System.out.println("Maximum: " + input);
    }
}
