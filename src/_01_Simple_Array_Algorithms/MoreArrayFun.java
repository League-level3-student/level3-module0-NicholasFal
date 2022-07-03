package _01_Simple_Array_Algorithms;

import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] stuff = {"Greetings", "Hello", "Hi", "Bye", "Goodbye", "See you later"};
		printing(stuff);
		printsReverse(stuff);
		printsEveryOther(stuff);
		randomizer(stuff);
	}


    //2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static void printing(String[] words) {
		for(int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
	}




    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.
	public static void printsReverse(String[] words) {
		for(int i = words.length - 1; i >= 0; i--) {
			System.out.println(words[i]);
		}
	}


    //4. Write a method that takes an array of Strings and prints every other String in the array.
	public static void printsEveryOther(String[] words) {
		for(int i = 0; i < words.length; i++) {
			if(i % 2 == 0) {
				System.out.println(words[i]);
			}
		}
	}

    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.
	public static void randomizer(String[] words) {
		Random ran = new Random();
		boolean continueLoop = true;
		String[] newWords = new String[words.length];
		for(int i = 0; i < words.length; i++) {
			continueLoop = true;
		while(continueLoop == true) {
		int num = ran.nextInt(words.length);
		if(newWords[num] == null) {
		newWords[num] = words[i];
		continueLoop = false;
		}
		}
		}
		for(int i = 0; i < newWords.length; i++) {
			System.out.println(newWords[i]);
		}
	}
}

