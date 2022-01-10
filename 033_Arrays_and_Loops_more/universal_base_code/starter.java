import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random  r = new Random();
		int random_size = r.nextInt(149)+51;
		int[] x = new int[random_size];
		System.out.println("There are "+x.length+" elements");
		int c = 0;
		int min  = 100;
		int max = 1;
	
	for(c = 0;c<x.length;c++){
		int ran = r.nextInt(100)+1;
		x[c] = ran;
	}
	
	for(c=0;c<x.length;c++){
		if(x[c]<min){
			min = x[c];
			
		}
		
	}
	System.out.println("The minumum of 1000 random numbers is : " +min);
	
	for(c = 0;c<x.length;c++){
		if(x[c]>max){
			max = x[c];
		}
	
	}
		System.out.println("the maximum of 1000 random numbers is : "+ max);
		int av=0;
	for(c = 0;c<x.length;c++){
		av = av+x[c];
		
	}
	int sum = av;
	int avg = sum/ random_size;
	System.out.println("the average of 1000 random number is: " +avg);
		
	}
}
