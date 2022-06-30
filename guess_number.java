import java.util.*;
import java.util.Random;
public class guess_number {
	public static void main(String[] args) {
		int chances=0,user_input,system_input,choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello Gamer!!! Welcome to Guess The Number");
		while(true){
		System.out.println("Enter 1 to start the game");
		System.out.println("Enter 2 to exit the game");
		choice = sc.nextInt();
		Random random = new Random();
		system_input = random.nextInt(100);
		if(choice==1){
			chances=1;
		while(chances<=10) {
			System.out.println("Enter the number between 1-100");
			user_input = sc.nextInt();
			if(user_input>0 && user_input<100) {
			if(user_input == system_input) {
				System.out.println("Congratulations...you guessed the number correctly");
				switch(chances) {
				case 1:
					System.out.println("Your score is 100");
					break;
				case 2:
					System.out.println("Your score is 90");
					break;
				case 3:
					System.out.println("Your score is 80");
					break;
				case 4:
					System.out.println("Your score is 70");
					break;
				case 5:
					System.out.println("Your score is 60");
					break;
				case 6:
					System.out.println("Your score is 50");
					break;
				case 7:
					System.out.println("Your score is 40");
					break;
				case 8:
					System.out.println("Your score is 30");
					break;
				case 9:
					System.out.println("Your score is 20");
					break;
				case 10:
					System.out.println("Your score is 10");
					break;
				}	
			break;
			
			}
			else if(user_input < system_input) {
				System.out.println("Hint....you have entered number which is lesser than actual number");
			}
			else {
				System.out.println("Hint....you have entered number which is greater than actual number");
			}
			chances++;
		} 
			else {
				System.out.println("Invalid input.Please enter number between 1-100");
			}
		}
		if(chances>10) {
		System.out.println("Sorry...your chances are completed.");
		System.out.println("Better luck next time");
		}

		}
		else if(choice==2) {
			System.out.println("Have a great day :)");
			break;
		}
		else {
			System.out.println("Invalid Input");
		}
	}	
	}
}
