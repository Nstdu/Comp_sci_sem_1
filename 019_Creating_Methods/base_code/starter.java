import java.util.Scanner;
import java.util.Random;

class starter {
	public static void toString (String dr )
	{
		
	System.out.println(dr);
		return;
	}
	public static void toStringCombined(String dr,String t1)
	{
	
		System.out.print( dr+ " " +t1);
		
		return ;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Write a sentence !");
		String t1 = sc.nextLine();
		System.out.print("Write a sentence !");
		String dr = sc.nextLine();
		
		toString(dr);
		toStringCombined(dr,t1);
	


		
	}
}
