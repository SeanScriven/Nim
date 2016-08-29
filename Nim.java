import java.util.Random;
import java.util.Scanner;
public class Nim {
	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int sticks = rand.nextInt(90) + 11;
		System.out.println("There are " + sticks + " sticks in the pile");
		int  turn = rand.nextInt(2);
		
		
		if (turn == 0){
			System.out.println("Users turn first");
		}
		else {
			System.out.println("Computer goes first");
			
		}
		
		while (sticks > 1)
		{
			int atMost = sticks/2;
			int pickup;
			if (turn == 0){
				System.out.println("How many sticks do you wish to pick up?");
				pickup = sc.nextInt();
				if (pickup < 1 || pickup > atMost){
					System.out.println("please pick up a number of sticks between 1 and " + atMost + " which is half of what's there");
				}
				else{
					
					sticks = sticks - pickup;
					System.out.println("You picked up " + pickup + " sticks");
					System.out.println("There are now " + sticks + " sticks left.");
					turn = 1;
				}
				
			}
			else{
				int i;
				for (i = 0; Math.pow(2, i) < sticks; i = i +1){
				}
				if (sticks == Math.pow(2, i) - 1){
					pickup = rand.nextInt(sticks / 2) + 1;
				}
				else if (sticks == 2){
					pickup = 1;
				}
				else {
					pickup = sticks - ((int) Math.pow(2, i - 1) - 1);
				}	
				
				pickup = rand.nextInt(atMost) + 1;
				sticks = sticks - pickup;
				System.out.println("Computer picked up " + pickup + " sticks");
				System.out.println("There are now " + sticks + " sticks left.");
				turn = 0;
			}
		}
		if (turn == 0) {
            System.out.println("You pick up the remaining stick, and lose!");
        } else {
            System.out.println("Compter picks up the remaining stick, and loses!");
        }
    }
	}

