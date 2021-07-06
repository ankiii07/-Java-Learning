package inheritence;

public class Singer extends Person
{
	public Singer(String name) {
		super(name);
		System.out.println("iside teacher Constructor");
	}
	public void sing()
	{
		System.out.println("singer is jubin nautial and he is singing a song");
	}
	public void eat()  //Method overriding
	{
		super.eat();
		System.out.println("singer"+name+ " is eating");
	}
	public static void laughing()
	{
		System.out.println("singer is laughing");
	}
}
