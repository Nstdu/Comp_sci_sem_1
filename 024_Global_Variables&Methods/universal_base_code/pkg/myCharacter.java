package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	String role;
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
	public  void myToString(){
		System.out.println("your role is "+ role);
		System.out.println("your strength treats is "+ Strength);
		System.out.println("your dexterity trait is "+ Dexterity);
		System.out.println("your intelligence trait is "+ intelligence);
		System.out.println("your constitution trait is "+ constitution);
		System.out.println("your charisma trait is "+ charisma);
		return;
		
	}

}

