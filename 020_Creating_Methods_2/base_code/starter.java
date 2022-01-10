import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow(int a ,int b )
	{
		int i = 1;
		int v = a;
		while(i<b){
		 v = v*a ;
		i++;	
		
		}
		System.out.print(v);
		return a;
		
			
	}
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner (System.in);
	System.out.println("what is your base number?");
	int c= sc.nextInt();
	System.out.println("what is your exponent number?");
	int d = sc.nextInt();
	pow(c,d);


		
	}
}
