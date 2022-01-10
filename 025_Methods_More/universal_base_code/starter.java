import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		myCharacter one = new myCharacter();
		one.myToString();
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue? ");
		String answer = sc.nextLine();
		myCharacter test1 = new myCharacter(answer);
		// System.out.print(test1.setRole(answer));
		test1.myToString();
		
		// System.out.print(one.a);


		
	}
}
