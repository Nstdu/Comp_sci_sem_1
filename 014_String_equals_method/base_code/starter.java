import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue? ");
		String answer = sc.nextLine();
		if(answer.equals("wizard")||answer.equals("Wizard"))
		{
			System.out.println("You've chosen the Wizard! Excelsior!");
		}
		else if (answer.equals("warrior")||answer.equals("Warrior"))
		{
			System.out.println("You've chosen the Warrior! For honor!");
		}
		else if (answer.equals("Rogue")||answer.equals("rogue"))
		{
			System.out.print("You've chosen the Rogue! How cunning!");
		}
		else{
			System.out.print("You've decided not to chose a role. Rerun program");
		}
	}
}
