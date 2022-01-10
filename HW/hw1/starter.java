import java.util.Scanner;
import java.util.Random;
class starter {
	public static void main(String args[]) {
		
		System.out.println("Slot Machine Rules:\n1. Each player starts with $100.\n2. Input a wager less than your total amount of money.\n3. The slot machine will roll 3 numbers from 1 to 10."); 
		System.out.println("   a. If two numbers match, you double your money.\n   b. If three numbers match, you triple your money.");
		System.out.println("   c. If none match, you lose your money.");
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		 	int aa= 100;
		
		
		while(true){
			
			int a = rand.nextInt(10)+1;
			int b = rand.nextInt(10)+1;
			int c = rand.nextInt(10)+1;
			System.out.println(" would you like to play the slots?(Yes/yes/Y/y): ");
			String e = sc.nextLine();
		
			if(e.equals("Yes")||e.equals("yes")||e.equals("Y")||e.equals("y"))
			{ 
				System.out.println("you have "+aa+" How much would you like to wager?" );
				int d = sc.nextInt();
				sc.nextLine();
				System.out.println("Great let's play");
				System.out.println("Your rolls are: ");
				System.out.println("______________________");
				System.out.println("|"+a+"|"+b+"|"+c+"|");
				System.out.println("______________________");
				if(a==b||b==c||c==a){
					aa= aa*2;
					System.out.println("you won!Your wager has now been doubled\nYou now have "+aa);
				}
				else if(a==b&& b==c &&c==a)
				{
					aa=aa*3;
					System.out.println("you won!your wager has now been tripled\nYou now have "+aa );
				}
				
				else{
					aa =aa-d;
					System.out.println("Didn't win this time, better luck next time!\n you now have "+aa);
				}
	
			}
			if(e.equals("no")||e.equals("No")||e.equals("N")||e.equals("n"))
			{
				System.out.println("you have "+aa);
				break;
			}
			
		if(aa ==0){
			System.out.println ("You're run out of money!Thanks for coming! Come back soon!");
			break;
			}
			
		}
	
	}
}
