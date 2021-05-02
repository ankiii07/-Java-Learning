package oopsConcept;

class Cat
{
	boolean hasFur;
	String breed,color;
	int legs, eyes, tail, ears;
	
	public void walk()
	{
		System.out.println("cat is walking by her legs");
	}
	public void eat()
	{
		System.out.print("cat drink milk");
	}
	public void description()
	{ 
		System.out.println("the cat has " + legs + " legs, "+ eyes + " eyes, "+ tail +" tail "+ ears + " ears ");
		System.out.println(breed);
	}
}
class Dog
{
	int legs,eyes;
	String breed,color;
	
	public void description()
	{
		System.out.println(breed);
		System.out.println(color);
	}
	
	public void run() 
	{
		System.out.println("dog run very fast to catch the thief");
		
	}
	public void jump()
	{
		System.out.println("dog makes long as well as high jump");
	}
}
public class MainClass {

	public static void main(String[] args) 
	{
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		
		cat1.walk();
		cat1.eat();
		cat1.legs = 4;
		cat1.eyes = 2;
		cat1.tail =1;
		cat1.ears = 3;
		cat1.breed = "cute";
		cat1.color = "blakish brown";
		
		cat2.walk();
		cat2.eat();
		cat2.legs = 4;
		cat2.eyes = 1;
		cat2.tail =1;
		cat2.ears =3;
		cat2.breed = "cute";
		cat2.color = "blakish brown";
		
		cat1.description();
		cat2.description();
		
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();  
		
		dog1.breed = "Greman Shepherd";
		dog1.color = "black";
		dog1.description();
		dog1.run();
		
		dog2.breed = "rottwiller";
		dog2.color = "brown";
		dog2.description();
		dog2.jump();

	}

}
