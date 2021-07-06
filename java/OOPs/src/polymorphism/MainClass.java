package polymorphism;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("for Run time polymorphism");
		Dog d = new Dog();
		
		Pet p = d;
		Animals a = d;
		
		d.walk();
		p.walk();
		
		System.out.println(d.name);
		System.out.println(p.name);
		
		System.out.println("compile time polymorhism");
		
		greetings();
		
		greetings("Ankit Yadav");
		
		
		
	}
	public static void greetings()
	{
		System.out.println("Hii, This Side Ankit Yadav");
	}
	public static void greetings(String s)
	{
		System.out.println(s);
	}

}
