/**
 * Given Max Number at 1st Position return the Same Number
 */
package com.bridgelabz;

public class MaximumNumber{
    public static void main(String[] args) {
        System.out.println("Maximum Number: " +findMaximumNumber(22, 1, 3));
    }

    /**
     * @param number1
     * @param number2
     * @param number3
     * Used to find the maximum number of given three numbers using compareTo method
     */
    private static Integer findMaximumNumber(Integer number1, Integer number2 , Integer number3) {
        if((number1.compareTo(number2) == 1) && (number1.compareTo(number3) == 1))
        {
            return number1;

        }else if((number2.compareTo(number1) == 1) && (number2.compareTo(number3) == 1))
        {
            return number2;
        }
        else{
            return number3;
        }
    }
}
