import java.util.Scanner;
class starter {
	public static int factorial(int x){
		int counter = 1;
		int y = x;
		int c = x;
		while(true){
			c=c-1;
			y = y*(c);
			if((x-1)== counter){
				break;
			}
			counter = counter+1
		}
		return y;
	}
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int x= sc.nextInt();
		System.out.print(factorial(x));
		}
	}
}
