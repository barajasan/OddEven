

import java.util.Arrays;
import java.util.Scanner;

public class OddEven {
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        int size = 10;
        int[] evenGuess = new int[size];
        int[] oddGuess = new int[size];
        int[] won = new int[size];
        int[] lost = new int[size];
        int[] compNum = new int[size];
        int[] round = new int[size];
        String response = null;
        while (i < 10) {
        	int gameNum = 1 + (int) (Math.random() * 2);
        	compNum[i] = gameNum;
        	System.out.println("Guess if the dice is odd or even. Use 1 for odd and 2 for even");
        	int ans = input.nextInt();
        	if ((ans < 1) || (ans > 2)) {
        		System.out.println("Please use either 1 or 2");
        	}
        	else {
        		if (ans == 2) {
        			evenGuess[i] = 1;
        		} else {
        			oddGuess[i] = 1;
        		}
        		if (ans == gameNum) {
        			response = "You guessed right";
        			won[i] = 1;
        		} else {
        			response = "Sorry you quessed wrong";
        			lost[i] = 1;
        		}
        	}
        	System.out.println(response);
        	round[i] = i+1;
        	i++;
        }
        i = 0;
        while (i < 10) {
        	System.out.printf(
        			"Round: %d, Even Guess: %d, Odd Guess: %d, Computer's Number: %d, Won: "
        			+ "%dn", round[i], evenGuess[i], oddGuess[i], compNum[i],
        			won[i]);
        			
        			i++;
        
        	
        		}
        			
        	}
                        
}           