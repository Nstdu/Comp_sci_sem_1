import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Ascii one = new Ascii("human");
		one.printArt();
		Ascii two = new Ascii("dog");
		two.printArt();
		Ascii three = new Ascii("cactus");
		three.printArt();
		Ascii four = new Ascii("other");
		four.setType("other");
		four.setName("happy");
		four.setAscii(":0");
		four.setNumber(2);
		four.printArt();
		Ascii five = new Ascii("Mood");
		five.printArt();
	}
}
