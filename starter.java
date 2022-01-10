import java.util.Scanner;

class starter {
	
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		int m =Math.max(13 - 6 * 11, 30 % 7 * (-2));
		System.out.println("Maximum = "+m);
		double s = Math.sqrt(3 * 8 + 31 % 7);
		System.out.println("Square = "+ s);
		double p = Math.pow (37 / 3, 35 % 21);
		System.out.println("Power =" +p);
		double end = Math.max(Math.pow( 2,14%3) , Math.sqrt ( 2*6) );
		System.out.println("Max= "+end);
		//extra
		System.out.println("Please enter a double: ");
		double y  = sc.nextDouble ();
		System.out.print("Please enter another double: ");
		double x  = sc.nextDouble ();
		double m2= Math.max(y,x);
		double s2 = Math.sqrt(y);
		double p3 =Math.pow(x,y);
		System.out.println("Maximum number of x and y is :" + m2);
		System.out.println("Square root of y is:"+ s2);
		System.out.println("Power of x and y is:"+p3);
		
		
		
	}
}
