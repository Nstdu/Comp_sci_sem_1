import java.util.Scanner;
import java.util.Random;
class starter {
	public static boolean checkPrime(int a){
	int y = a-1;
	while(true){
		y = y-1;
		if(a%y == 0 ){
			return false;
		}
		if(y<=1){
		break;
		}
	
		
		}
		return true;
	}
		public static void printPrimes(int c ){
			int cc = c-1;
			if(checkPrime(c)){
				System.out.println(c);
				}
			while(true){
			
				if(checkPrime(cc)){
					
					System.out.println(cc);
					
				}
			
				if(cc ==2){
					break;
				}
				cc = cc - 1;
			}
			
			return;
		}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number: ");
		int input = sc.nextInt();
		printPrimes(input);
	}
}
