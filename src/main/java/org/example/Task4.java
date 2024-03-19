package org.example;

public class Task4 {
    public static void main(String[] args) {
        //Create a 2D array of integers.
        // Develop a program which will calculate the sum of  even and odd numbers for that array.

        int[][] numbers={
                {12,6,8,9},
                {17,19,12,3}
        };
        int sumEven=0;
        int sumodd=0;
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers[i].length;j++){

                if(numbers[i][j]%2==0){
                    sumEven=sumEven+numbers[i][j];
                }else {
                    sumodd=sumodd+numbers[i][j];
                }
            }
        }
        System.out.println("The sum of even numbers in the array is "+ sumEven);
        System.out.println("The sum of odd numbers in the array is "+sumodd);
    }
}