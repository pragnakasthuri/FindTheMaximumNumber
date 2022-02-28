package com.bridgelabz;

public class FindTheMaximum {
    public static void main(String[] args) {
        findMaximum(12, 4, 3);
        findMaximum(3, 5, 1);
        findMaximum(3, 6, 9);
    }

    /**
     * @param number1
     * @param number2
     * @param number3
     * Used to find the maximum number of given three numbers using compareTo method
     */
    private static void findMaximum(Integer number1,Integer number2 ,Integer number3) {
        if((number1.compareTo(number2) == 1) && (number1.compareTo(number3) == 1))
        {
            System.out.println(number1+ " is greater than " +number2+ " and " +number3);

        }else if((number2.compareTo(number1) == 1) && (number2.compareTo(number3) == 1))
        {
            System.out.println(number2+ " is greater than " +number1+ " and " +number3);
        }
        else{
            System.out.println(number3+ " is greater than " +number1+ " and " +number2);
        }
    }
}
