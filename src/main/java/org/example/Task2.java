package org.example;

public class Task2 {
    public static void main(String[] args) {
        //Create an array of integer values. After the array is created,
        // calculate the sum of all stored elements in that array.

        int[] numbers={45,25,60,75,80,120 };

        int sum=0;
        for(int n:numbers){
            sum+=n;
        }
        System.out.println(sum);



    }
}
