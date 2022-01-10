package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	public String breed;
	public String name;
	public int age;
	

	public Dog() {
		name = "Clifford";
		age = 3;
		breed = "big red dog";
		
		
	}
	public Dog(String a ){
		name = a ; 
		age = 1;
		breed = "dog dog";
		
	}
	public Dog(String b,String e ){
		name = b;
		breed = e;
		age =1;
	}
	public Dog(int a , String  c){
		name = c;
		age = a;
		breed = "dog dog";
	
	}
	public void setName(String d){
		name = d;
		return;
	}
	public void setAge(int setage){
		age = setage;
		return;
	}
	public  void setBreed(String sb){
		breed = sb;
		return;
	}
	public  String getName(){
		return name;
		
	}
	public  int getAge(){
		return age;
	}
	public  String getBreed(){
		return breed;
	}
	public static boolean isSleeping(){
		Random rand  = new Random();
			int r =  rand.nextInt(2);
			if(r == 0 ){
			return true;	
			}
			else{
				return false;
			}
	}
	public void bark(){
		System.out.println(name+": bark");
		return;
		
	}

}

