import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random r = new Random();
		int [] x = new int[1000];
		int c = 0;
		while(c<1000){
			int rand = r.nextInt(1000);
			x[c] = rand;
		c++;
		}
		c = 0;
		while(c<x.length){
			System.out.println(x[c]);
			c++;
		}


		
	}
}
