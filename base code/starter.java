import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random();
		int r1 = rand.nextInt(9);
		System.out.println("A number between 0-9: " + r1);
		int r2 = rand.nextInt(100);
		r2+=1;
		System.out.println("A number between 1-100: " + r2);
		Double r3 = rand.nextDouble();
		double r6 = r3 +2.4 ;
		System.out.println("A number between 2.5 and 3.5 : "+ r6);
		double r4 = rand.nextDouble();
		int r8 = rand.nextInt(589);
		double r7 = r8+r4+14;
		System.out.println("A Double between 14 and 589: "+r7);
		
	}
}
