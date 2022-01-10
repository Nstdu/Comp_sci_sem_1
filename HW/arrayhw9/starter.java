import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Random rand = new Random();
	int [] array_1 = new int[20];
	System.out.println("these are the "+array_1.length +" numbers");
	int c = 0;
	
	while(c<array_1.length){
	int	r = rand.nextInt(50)+1;
		array_1[c] = r;
		System.out.print(array_1[c]+" ");
		c++;
	}
	System.out.println();
	System.out.println("These are those numbers backwards");
	c = 19;
	int [] array_2 = new int[20];
	while(c>=0){
		array_2[c]=array_1[c] ;
		System.out.print(array_2[c]+" ");
		c = c-1;
		
	}


		
	}
}
