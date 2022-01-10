import java.util.Scanner;
class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		int i = a;
		int b = a+3;
		while (true){
			System.out.println(a+1);
			if( a== b){
				break;
			}
			a++;
		}
	}
}
