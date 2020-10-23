import java.io.File;
import java.util.Scanner;

public class driver {
	public static void main(String[] args)
	{
		//Calls method to log the file
		GolfBag GolfClubs = new GolfBag("GolfClubs.dat");
		//Introduces a program and asks for an input
		Scanner myObj = new Scanner (System.in);
		System.out.println("Golf Club Distance Program");
		System.out.println("What is the distance you want to drive or putt?");
		//Logs the input and turns it into an integer
		String Distance_input = myObj.nextLine();
		Integer DisNum = Integer.parseInt(Distance_input);
		//Should call the method for finding the right golf club and then print the value to the screen.
		System.out.println(GolfClubs.DistanceSearch(DisNum));
	}
}
