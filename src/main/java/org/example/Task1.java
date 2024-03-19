package org.example;

public class Task1 {
    public static void main(String[] args) {
        //Create a program that uses an array to store a list of temperatures for a week,
        // and then uses a loop to find the highest and lowest temperature for the week.//
        //
        int[] temp={45,65,32,29,75,90,};

        int highest=temp[0];
        int lowest=temp[0];
        for(int n:temp){
            if(highest<n){
                highest=n;

            }
            if(lowest>n){
                lowest=n;
            }
        }
        System.out.println(highest);
        System.out.println(lowest);


}
        }