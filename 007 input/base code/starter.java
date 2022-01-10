import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("what is your name"); 
		String text = sc.nextLine();
		System.out.println("what is your age?"); 
		int number = sc.nextInt();
		System.out.println("what month were you born?(1-12)");
		int num = sc.nextInt();
		System.out.println("what day were you born?(1-31)");
		int n = sc.nextInt();
		System.out.println("what year were you born?");
		int year = sc.nextInt();
		System.out.println("If I have a dollar and two quarters, how much money do I have?");
		double money = sc.nextDouble();
		System.out.println("you name is"+text+"and you were born on"+num+"/"+n+"/"+year+".");
		System.out.println(" You are "+number+" yearrs old!!");
		System.out.println("you have $"+ money+" in your wallet");
	}
}
