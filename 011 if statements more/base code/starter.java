import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
			Scanner sc = new Scanner(System.in);
			System.out.print("Please input your first number: ");
			int number = sc.nextInt();
			System.out.print("Please input your second number: ");
			int number2 = sc.nextInt();
			if(number2!=number)
			{
				System.out.print("your numbers are different");
			}
			if(number2 == number)
			{
				System.out.print("your numbers are the same!");
			}
			
			
			
			
			
			
	}
}
