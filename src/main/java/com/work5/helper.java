package com.work5;
import java.util.Scanner;  // Import the Scanner class


public class helper {

    public static void print(String str) {
        System.out.println(str);
    }

    /**
     * Function to return scan int
     */
    public static Scanner scan() {
        return new java.util.Scanner(System.in);
    }

    // Function to get average of arrayList
    public static double getAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

}
