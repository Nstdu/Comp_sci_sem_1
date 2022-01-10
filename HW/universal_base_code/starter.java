import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		 Dog red  = new Dog("winter");
		 red.setAge(5);
		 System.out.println("this is "+ red.getName()+" he is "+red.getAge());
		 Dog dog2 = new Dog("felicia","poodle");
		 System.out.println("this is "+ dog2.getName()+" his is a "+ dog2.getBreed());
		 boolean fbi = red.isSleeping();
		 boolean hw = dog2.isSleeping();
	if(fbi == true){
		System.out.print(red.getName()+" is sleeping");
	}
		else if (fbi == false){
			red.bark();
		}
	if(hw == true && fbi == false){
		System.out.println(dog2.getName()+" is sleeping");
		dog2.bark();
	}
	if(hw==false && fbi == false){
		System.out.println(dog2.getName()+" is awake");
		dog2.bark();
	}
	
	}
}
