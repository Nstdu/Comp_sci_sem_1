import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random  r = new Random();
		int[] y = new int[100];
		int c= 1;
	 while (c < 100){
	 	int ran = r.nextInt(99);
	 	y[c] = ran;
	 	System.out.println(y[c]);
	 	c++;
	 }
		

		
	}
}
