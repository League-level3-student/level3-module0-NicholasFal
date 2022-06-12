package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
    	String[] strings = {"Yes", "Probably", "Maybe", "Probably not", "No"};
        // 2. print the third element in the array
    	System.out.println(strings[3]);
        // 3. set the third element to a different value
    	strings[3] = "Not sure";
        // 4. print the third element again
    	System.out.println(strings[3]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
    	for(int i = 0; i < strings.length; i++) {
    		strings[i] = "Unlikely";
    	}
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
    	for(int i = 0; i < strings.length; i++) {
    		System.out.println(strings[i]);
    	}
        // 7. make an array of 50 integers
    	int[] randomInts = new int[50];
        // 8. use a for loop to make every value of the integer array a random
        //    number
    	Random ran = new Random();
    	for(int i = 0; i < randomInts.length; i++) {
    		randomInts[i] = ran.nextInt(100) + 1;
    	}
        // 9. without printing the entire array, print only the smallest number
        //    on the array
    	int smallestInt = 101;
    	int largestInt = 0;
    	for(int i = 0; i < randomInts.length; i++) {
    		if(randomInts[i] < smallestInt) {
    		smallestInt = randomInts[i];
    		} else if(randomInts[i] > largestInt) {
    			largestInt = randomInts[i];
    		}
    	}
    	System.out.println("Smallest int: " + smallestInt);
    	System.out.println("Largest int: " + largestInt);
        // 10 print the entire array to see if step 8 was correct
    	for(Integer i : randomInts) {
    		System.out.println(i);
    	}
        // 11. print the largest number in the array.
    	
        // 12. print only the last element in the array
    	System.out.println("Last Element: " + randomInts[49]);
    }
}
