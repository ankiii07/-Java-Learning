package inheritence;

public class Doctor extends Person
{
	public Doctor(String name) {
		super(name);
		System.out.println("iside teacher Constructor");
	}
	public void surgeon()
	{
		System.out.println("doctor is surgeon");
	}
	public void eat()    //Method overriding
	{
		super.eat(); 
		System.out.println("doctor"+name+ " is eating");
	}
	public static void laughing()
	{
		System.out.println("Doctor is laughing");
	}
}
