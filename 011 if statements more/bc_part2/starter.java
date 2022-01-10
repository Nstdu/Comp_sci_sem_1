import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("please enter your first number:");
		int number = sc.nextInt();
		System.out.print("please enter your second number:");
		int number2 = sc.nextInt();
		System.out.print("please enter your third number:");
		int number3 = sc.nextInt();
		if((number > number2)&&(number> number3))
		{
			System.out.println("Your first number is the largest of the three!");
			System.out.println("The number was " +number);
		
		}
			if( (number2 > number3)&&(number2> number))
		{
			System.out.println("Your second number is the largest of the three!");
			System.out.println("The number was " +number2);
		}
		if(( number3 > number2)&&(number3> number))
		{
			System.out.println("Your third number is the largest of the three!");
			System.out.println("The number was " +number3);
		}
		if((number<number2)&&(number<number3))
		{
		System.out.println("your first number is the smallest of the three!");
		System.out.println("The number was " + number);
		}
		if((number2<number)&&(number2<number3))
		{
		System.out.println("your second number is the smallest of the three!");
		System.out.println("The number was " + number2);
		}
		if((number3<number)&&(number3<number2))
		{
		System.out.println("your third number is the smallest of the three!");
		System.out.println("The number was " + number3);
		}
	
	}
}
