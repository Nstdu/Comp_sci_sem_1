import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random  r = new Random();
		int[]array = new int [20];
		int target_number = r.nextInt(10)+1;
		System.out.println("these are the "+ array.length +"numbers");
		int random;
	int i ;	
	for( i = 0; i <array.length;i ++){
		 random = r.nextInt(10)+1;
		array[i] = random ; 
		System.out.print(array[i]+" ");
	}
	System.out.println();
	System.out.println("---------------------------------------------------");
	System.out.println("the random number to look for is "+ target_number );
	int aa= 0;
	for(int a = 0;a<array.length;a++){
		if(array[a]==target_number){
			System.out.println("Duplicate found at "+a);
			aa++;
		}
	}
	System.out.println("Total number of duplicates for "+ target_number +" is "+aa);
	System.out.println("Looking for two in a row: ");
	for(int y = 0; y< array.length-1;y++){
		if(array[y] == array[y+1]){
			System.out.println("Two in a row found at indexes "+y+" and "+(y+1)+" The number is "+ array[y]);
		}
	}
	}
}
