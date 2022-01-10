import java.util.Scanner;
import java.util.Random;
class character{
	String w = new String ("Your role is Wizard");
	String s = new String ("Your strength trait is ");
	int s1 = 5;
	String i = new String ("Your intelligence trait is ");
	int i1 = 5;
	String d = new String ("Your decterity trait is ");
	int d1 = 5;
	String co= new String ("Your constitution trait is ");
	int co1 = 5;
	String c= new String ("Your charisma trait is ");
	int c1 = 5;
}

class starter {
	public static void main(String args[]) {
		character wizard = new character();
		System.out.println(wizard.w);
		System.out.println(wizard.s+ wizard.s1);
		System.out.println(wizard.i+ wizard.i1);
		System.out.println(wizard.d+ wizard.d1);
		System.out.println(wizard.co+ wizard.co1);
		System.out.println(wizard.c+ wizard.c1);



		
	}
}
