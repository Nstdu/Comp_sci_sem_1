import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		System.out.println("what is your name?");
		String name = sc.nextLine();
		System.out.println("what is your title? Ex: Slayer of Dragons");
		String title = sc.nextLine();
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue? ");
		String answer = sc.nextLine();
		if(answer.equals("wizard")||answer.equals("Wizard"))
		{
			System.out.println("You've chosen the Wizard! Excelsior!");
			System.out.println("You have 25 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
		}
		else if (answer.equals("warrior")||answer.equals("Warrior"))
		{
			System.out.println("You've chosen the Warrior! For honor!");
			System.out.println("You have 25 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
		}
		else if (answer.equals("Rogue")||answer.equals("rogue"))
		{
			System.out.println("You've chosen the Rogue! How cunning!");
			System.out.println("You have 25 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
		}
		else{
			System.out.println("You've decided not to chose a role. Rerun program");
			System.out.println("You have 25 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
		}
		System.out.print("strength (1-10): ");
		int strength = sc.nextInt();
		int s = 25-strength;
		System.out.println("you have "+s +" left to spend.");
		System.out.print("Dexterity (1-10): ");
		int dexterity = sc.nextInt();
		int d = s-dexterity;
		System.out.println("you have "+d +" left to spend.");
		System.out.print("Intelligence (1-10): ");
		int inter= sc.nextInt();
		int i = d - inter;
		System.out.println("you have "+i+" left to spend.");
		System.out.print("Constitution (1-10): ");
		int constitution = sc.nextInt();
		int c = i- constitution;
		System.out.println("you have "+c+" left to spend.");
		System.out.print("charisma (1-10): ");
		int charisma = sc.nextInt();
		int ch = c- constitution;
		System.out.println("you have "+ch+"to spend for next time");
		System.out.println("--------------------------------------------------");
		System.out.println("You are "+name+", the "+title+" of cvhs.");
		System.out.println("you are a "+answer+" with the following stats!");
		System.out.println("Strength -"+strength);
		System.out.println("dexterity -"+dexterity);
		System.out.println("Intelligence - "+ inter);
		System.out.println("constitution- "+constitution);
		System.out.println("charisma - "+ charisma);
		System.out.println("Good luck on your quest "+name);
		
		
		
		
	}
}
