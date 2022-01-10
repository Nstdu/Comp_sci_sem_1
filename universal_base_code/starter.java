import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue? ");
		String answer = sc.nextLine();
		myCharacter test = new myCharacter();
		myCharacter test1 = new myCharacter(answer);
		// String a2 = sc.nextLine();
		
		System.out.print(test1.role(answer));
		System.out.print(test.a);

		
	}
}
