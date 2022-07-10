package _03_Intro_to_2D_Arrays;

import java.util.Random;

public class _01_IntroTo2DArrays {

    public static void main(String[] args) {
        // 1. declare a 2D array of integers with 3, 1D arrays that each hold
        //    3 integers
    	int[][] twoDArray = {{1, 3, 5}, {2, 4, 6}, {3, 5, 7}};
        // 2. use two for loops to set all the elements in the 2D array to
        //    a different integer
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
    	Random ran = new Random();
    	for(int i = 0; i < twoDArray.length; i++) {
    		for(int j = 0; j < twoDArray[i].length; j++) {
    			twoDArray[i][j] = ran.nextInt(10) + 1;
    		}
    	}
        
        // 3. print the third element from the second 1D array (2DArray[1][2])
    		System.out.println(twoDArray[1][2]);
        // 4. set the third element from the second 1D array to a different
        //    value
    		twoDArray[1][2] = ran.nextInt(10) + 1;
        // 5. print the element again and verify the value has changed
    		System.out.println(twoDArray[1][2]);
    }
}
