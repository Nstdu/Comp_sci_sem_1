package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter{
	public String role;
	public String a ;
	
	public myCharacter() {
	
	 role= new String("no role");
		
	}
	public myCharacter(String a)
	{
	role = a;
	}
	public String role(String a)
	{
		role = a;
	
		if(a.equals("wizard")||a.equals("Wizard"))
		{
			System.out.println("You've chosen the Wizard! Excelsior!");
		}
		else if (a.equals("warrior")||a.equals("Warrior"))
		{
			System.out.println("You've chosen the Warrior! For honor!");
		}
		else if (a.equals("Rogue")||a.equals("rogue"))
		{
			System.out.print("You've chosen the Rogue! How cunning!");
		}
		else{
			System.out.print("You've decided not to chose a role");
		}
		return role;
	}
	

}

