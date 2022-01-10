import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	int r = rand.nextInt(1000);
	System.out.println("Guess a number: ");
	
	int number = sc.nextInt();
	
	int i = 0;
	while(true)
	{
		if(number>r)
		{
			
			System.out.println("You're a little too high!");
			System.out.println("Guess a number: ");
			number =sc.nextInt();
		}
		else if(number<r){
		
			System.out.println("Youre a little too low");
			System.out.println("Guess a number: ");
			number =sc.nextInt();
		}
		else if(number == r)
		{
			
			System.out.print("you win ");
			break;
		}
		i++;
	}


		
	}
}
