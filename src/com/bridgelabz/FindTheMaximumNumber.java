/**
 * Given Max Number at 1st Position return the Same Number
 */
package com.bridgelabz;

public class FindTheMaximumNumber {
    public static void main(String[] args) {
        findMaximumNumber(1, 10, 3);
    }

    /**
     * @param number1
     * @param number2
     * @param number3
     * Used to find the maximum number of given three numbers using compareTo method
     */
    private static void findMaximumNumber(Integer number1, Integer number2 , Integer number3) {
        if((number1.compareTo(number2) == 1) && (number1.compareTo(number3) == 1))
        {
            System.out.println("number1 is greater than number2 and number3");

        }else if((number2.compareTo(number1) == 1) && (number2.compareTo(number3) == 1))
        {
            System.out.println("number2 is greater than number1 and number3");
        }
        else{
            System.out.println("number3 is greater than number1 and number2");
        }
    }
}
