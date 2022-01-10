import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random();
		int rand_num = rand.nextInt(1000);
		Scanner sc = new Scanner(System.in);
		System.out.print("Pick a number between 1-1000: ");
		int num = sc.nextInt();
		if(rand_num == num)
		{
			System.out.println("your guessed the corrcet number. ");
		}
		else{
			System.out.print("Your number wasn't the random number.The number was "+ rand_num);
		}
	}
}
