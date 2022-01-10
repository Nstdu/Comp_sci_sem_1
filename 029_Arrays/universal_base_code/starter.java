import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int [] x = new int[10];
		x[0] = 9;
		x[1] = 8;
		x[2] = 7;
		x[3] =6;
		x[4] = 5;
		x[5] = 4;
		x[6] = 3;
		x[7] = 2;
		x[8] = 1;
		x[9] = 0;
		int c = 0;
		while(c<= 9){
			System.out.println(x[c]);
			c++;
		}
	}
}
