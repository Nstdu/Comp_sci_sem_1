import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("what is your name?");
		String name = sc.nextLine();
		System.out.println("how many times");
		int times = sc.nextInt();
		int c = 1;
		while(true)
		{
			System.out.println(name);
			if(c == times)
			{
				break;
			}
			c++;
		}
		
		
		

		
	}
}
