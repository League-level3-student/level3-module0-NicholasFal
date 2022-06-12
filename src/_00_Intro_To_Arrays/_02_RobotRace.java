package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
	// 1. make a main method
		public static void main(String[] args) {

			// 2. create an array of 5 robots.
			Robot[] robots = new Robot[5];
			int[] angleOfRobots = new int[5];
			// 3. use a for loop to initialize the robots.
			for (int i = 0; i < robots.length; i++) {
				robots[i] = new Robot("mini");
			}
			// 4. make each robot start at the bottom of the screen, side by side, facing up
			for (int times = 0; times < robots.length; times++) {
				robots[times].setY(500);
				robots[times].setX(100 + times * 175);
			}

			// 5. use another for loop to iterate through the array and make each robot move
			// a random amount less than 50.
			Random ran = new Random();
			int robotWinner = -1;
			int turn;
			boolean raceStillGoing = true;
			while (raceStillGoing) {
				for (int i = 0; i < robots.length; i++) {
					turn = ran.nextInt(50);
					for (int j = 0; j < turn; j++) {
						robots[i].penDown();
						robots[i].move(1);
						robots[i].turn(1);
					}
					angleOfRobots[i] += turn;
					if (angleOfRobots[i] >= 360) {
						robotWinner = i + 1;
						raceStillGoing = false;
						break;
					}
				}
			}
			// 6. use a while loop to repeat step 5 until a robot has reached the top of the
			// screen.

			// 7. declare that robot the winner and throw it a party!
			JOptionPane.showMessageDialog(null, "Robot #" + robotWinner + " won the race!");
			// 8. try different races with different amounts of robots.
			// 9. make the robots race around a circular track.
		}
}
