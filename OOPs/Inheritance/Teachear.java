package inheritence;

public class Teachear extends Person
{
	
public Teachear(String name) {
	super(name);
	System.out.println("iside teacher Constructor");
}
	public void teach()
	{
		System.out.println("Anuj sir is teaching java");
	}
	public void eat()  //Method overriding
	{
		super.eat();   //super class to refer immediate 
		System.out.println("teacher"+name+ " is eating");
	}
	public static void laughing()
	{
		System.out.println("teacher is laughing");
	}
}
