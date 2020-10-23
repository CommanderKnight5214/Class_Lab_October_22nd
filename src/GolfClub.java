
public class GolfClub 
{
	//Intial variables
	private String Name;
	private int Distance;
	
	public GolfClub(String Name, int Distance)
	{
		//Intial objects
		this.Name = Name;
		this.Distance = Distance;
	}
	public GolfClub(String s)
	{
		//Splits the objects
		String[] parts = s.split(":");
		this.Name = parts[0];
		this.Distance = Integer.parseInt(parts[1]);
	}
	public void display()
	{
		//Displays the objects
		System.out.println(this.Name + this.Distance);
	}
	public String getName()
	{
		//Returns name 
		return this.Name;
	}
	public int getDistance()
	{
		//Returns Distance
		return this.Distance;
	}
}
