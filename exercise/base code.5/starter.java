import java.util.Scanner;
class starter {
	// public static int three (int a ,int b)
	// {
	// int c = a*b;
	// System.out.println(a+"*"+b+"="+c);
	// if(c%3==0)
	// {
	// 	System.out.print(c+" is divisible by 3");
	// }
	// else if(c%3!=0){
	// 	System.out.print(c+" is not divisible by 3");
	// }
	// return c;
	// }
	
	public static boolean threetwo(int a,int b )
	{
	int c = a*b;
	System.out.println(a+"*"+b+"="+c);
	if(c%3==0)
	{
		System.out.print(c+" is divisible by 3");
		return true;
	}
	else if(c%3!=0){
		System.out.print(c+" is not divisible by 3");
		return false;
	}
	return true;
	}
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int aa = sc.nextInt();
		System.out.println("enter another number");
		int bb = sc.nextInt();
		//three(aa,bb);
		threetwo(aa,bb);
		
	}
}
