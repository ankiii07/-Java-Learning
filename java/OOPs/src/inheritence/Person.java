package inheritence;

public class Person {
	
	protected String name;
	
	public Person(String name)
	{
		this.name = name;
		System.out.println("inside person constructor");
	}
	public void walk()
	{
		System.out.println(name+ " is walking");
	}
	public void eat()
	{
		System.out.println(name+ " is eating");
	}
	public static void laughing()
	{
		System.out.println("person is laughing");
	}
}