package methods;
import java.util.*;
public class PassByValue {

	public static void main(String[] args) 
	{
		 System.out.println("FOR PRIMITIVE CLASS");
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		swap(c, d);
		 System.out.println(c+ "  "+ d);
		 
		 System.out.println("FOR NON-PRIMITIVE CLASS PASS BY VALUE");
		 Dog dog1 = new Dog();
		 dog1.legs =4;
		 
		 Dog dog2 = new Dog();
		 dog2.legs =3;
			
		 swap(dog1,dog2);
		 System.out.println(dog1.legs+ "  "+ dog2.legs);
		 
		 System.out.println("FOR NON-PRIMITIVE CLASS PASS BY REFERENCE");
		 Dog dog = new Dog();
		 dog.legs = 4;
		 
		 System.out.println(dog.legs);
		change(dog);
		
		System.out.println(dog.legs);

	}
	
	static void swap(int a, int b)
	{
		int temp = a;
		a = b;
		b = temp;
		
	}
	
	static void swap(Dog a, Dog b)
	{
		Dog temp = a;
		a = b;
		b = temp;
		
	}
	
	static void change(Dog dog)
	{
		dog.legs = 6;
	}

}

class Dog
{
	int legs;
}