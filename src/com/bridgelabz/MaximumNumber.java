/**
 * Given Max Number at 1st Position return the Same Number
 */
package com.bridgelabz;

public class MaximumNumber{
    public static void main(String[] args) {
        System.out.println("Maximum Number: " +findMaximumNumber(22.0f, 1.5f, 3.5f));
    }

    /**
     * @param number1
     * @param number2
     * @param number3
     * Used to find the maximum number of given three numbers using compareTo method
     */
    private static Float findMaximumNumber(Float number1, Float number2 , Float number3) {
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
