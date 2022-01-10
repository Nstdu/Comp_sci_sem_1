import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word.");
		String word = sc.nextLine();
		System.out.println("letter by letter:");
		for(int c = 0; c< word.length();c++){
			System.out.println(c+word.substring(c,c+1));
			// System.out.print();
		}


		
	}
}
