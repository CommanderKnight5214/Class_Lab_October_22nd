import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
public class GolfClubs {
	 //Intial variable and array
	 private ArrayList<GolfBag> GolfBag;
	 private GolfClubs Answer;
	 
	 public GolfClubs()
	 {
		 //Intial objects with array object
		 this.GolfBag = new ArrayList<GolfBag>();
		 this.Answer = Answer;
	 }
	 
	 //This method logs the object from a file
	 public GolfClubs(String filename)
	 {
		 this();
		 try
		 {
			 Scanner input = new Scanner(new File(System.getProperty("user.dir") + "/src/" + filename));
			 while(input.hasNext())
			 {
				 this.GolfBag.add(new GolfClubs(input.nextLine()));
			 }
			 input.close();
		 }
		 catch(Exception e) {e.printStackTrace();}
	 }
	 //This method finds the golfclub that is greater than the distance and takes that method one step down.
	 public GolfClubs DistanceSearch(int Distance)
	 {
		 //String Answer;
		 //For the size of golfbag
		 for(int i = 0; i < this.GolfBag.size()-1; i++)
		 {
			 //If the the distance input is greater than the object distance.
			 //Go back one bucket and return that answer. 
			 if(this.GolfBag.get(i).getDistance() > Distance)
			 {
				GolfClubs Answer = this.GolfBag.get(i-1).getName(); 
			 }
		 }
		 return Answer;
		
	 }
	 public void display()
	 {
		 System.out.println("Golf Club " + Answer +" would be the best club for your range");
	 }
}

