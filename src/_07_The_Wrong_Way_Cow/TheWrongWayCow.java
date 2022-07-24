/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Task
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
*/

package _07_The_Wrong_Way_Cow;

public class TheWrongWayCow {

    public static int[] findWrongWayCow(final char[][] field) {
        // Fill in the code to return the [col, row] coordinate position of the
        // head (letter 'c') of the wrong way cow!
    	int leftwardCows = 0;
    	int[] leftwardArray = new int[2];
    	int rightwardCows = 0;
    	int[] rightwardArray = new int[2];
    	int upwardCows = 0;
    	int[] upwardArray = new int [2];
    	int downwardCows = 0;
    	int[] downwardArray = new int[2];
    	for(int i = 0; i < field.length; i++) {
    		for(int j = 0; j < field[i].length; i++) {
    			if(field[i][j] == 'c') {
    				if(j < field[i].length - 2) {
    				if(field[i][j + 1] == 'o' && field[i][j + 2] == 'w') {
    					rightwardCows++;
    					rightwardArray[0] = i;
    					rightwardArray[1] = j;
    				}
    				}
    				if(j > 1) {
    				if(field[i][j - 1] == 'o' && field[i][j - 2] == 'w') {
    					leftwardCows++;
    					leftwardArray[0] = i;
    					leftwardArray[1] = j;
    				}
    				}
    				if(i < field.length - 2) {
    				if(field[i + 1][j] == 'o' && field[i + 2][j] == 'w') {
    					downwardCows++;
    					downwardArray[0] = i;
    					downwardArray[1] = j;
    				}
    				}
    				if(i > 1) {
    				if(field[i - 1][j] == 'o' && field[i - 2][j] == 'w') {
    					upwardCows++;
    					upwardArray[0] = i;
    					upwardArray[1] = j;
    				}
    				}
    			}
    		}
    	}
    	
        if(leftwardCows == 1) {
        return leftwardArray;
        } else if(rightwardCows == 1) {
        	return rightwardArray;
        } else if(downwardCows == 1) {
        	return downwardArray;
        } else if(upwardCows == 1) {
        	return upwardArray;
        } else {
        	return null;
        }
    }
}
