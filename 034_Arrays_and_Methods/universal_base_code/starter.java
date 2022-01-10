import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	 public static void toStringArray(int[] a){
		for(int i = 0; i<a.length;i++){
		System.out.println(a[i]);
		}
		return;
	}
	public static int getArrayAverage(int [] b){
		int y =0;
		for(int ii = 0; ii<b.length; ii++){
			y=y+b[ii];
		}
		int sum = y;
		int avg = sum/b.length;
		System.out.println("The average of 100 random numbers is:"+ avg);
		return avg;
		
	}
	public static int getArrayMax (int [] c ){
		int max = 1;
		for(int count= 0;count<c.length;count++){
			if(c[count]>max){
				max = c[count];
			}
		}
		
		System.out.println("The maximum of 100 random numbers is:"+ max);
		return max;
	}
	public static int getArrayMin(int[]d){
		int min=100;
		for(int counter=0;counter<d.length;counter++){
		if(d[counter]<min){
			min = d[counter];
		}
		}
		System.out.println("The minumum of 100 random numbers is:"+min);
		return min;
	}
	public static void main(String args[]) {
	Random rand  = new Random();
	int array_size = rand.nextInt(101);
	int[] array = new int[array_size];
	for(int i = 0; i<array.length;i++){
	int value = rand.nextInt(100)+1;
	array[i] = value;
	System.out.print(value);
	}
	
	toStringArray(array);
	getArrayAverage(array);
	 getArrayMax(array);
	getArrayMin(array);
		
	}
}
