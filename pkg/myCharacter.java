package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	String role;
	 public String a ;
	int Strength;
	int Dexterity;
	int intelligence; 
	int constitution;
	int charisma;

	public myCharacter() {
	role = "No Role";
		Strength = 0;
		Dexterity = 0;
		intelligence = 0;
		constitution = 0;
		charisma = 0;	
		
	}
		public myCharacter(String a)
	{
	role = a;
	}
		public  void myToString(){
		System.out.println("your role is "+ role);
		System.out.println("your strength treats is "+ Strength);
		System.out.println("your dexterity trait is "+ Dexterity);
		System.out.println("your intelligence trait is "+ intelligence);
		System.out.println("your constitution trait is "+ constitution);
		System.out.println("your charisma trait is "+ charisma);
		return;
		
	}
	public String setRole(String a)
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
	public int setStrength(int b){
		return Strength;
	}
	public int setDexterity(int c){
		return Dexterity;
	}
	public int setIntelligenece(int d){
		return intelligence;
	}
	public int setConstitution(int e){
		return constitution;
	}
	public int setCharisma(int i){
		return charisma;
	}
	public boolean setAll(String u ,int g ,int h, int k , int y, int r){
		return true ; 
	}
}

