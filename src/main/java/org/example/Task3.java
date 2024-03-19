package org.example;

public class Task3 {
    public static void main(String[] args) {

        //Create a 2D array or integer type where you will store odd and even numbers.
        // Develop a program which will identify/print the even numbers only.

        int[][] numbers={
                {45,25,60,85,20,18},
                {16,200,62,49,61,67},
                {11,17,47,37,32,9}
        };

        for(int[] evenOddNum:numbers){
            for(int i:evenOddNum){
                if(i%2==0){
                    System.out.println(i);
                }
            }
        }

    }
}
