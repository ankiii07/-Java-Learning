package inheritence;


public class MainClass {

	public static void main(String[] args) 
	{
		Teachear t = new Teachear("mr. ankit");
		t.name = "Mr.Anuj";
		t.eat();
		t.walk();
		Singer s = new Singer("mr. ankit");
		s.name = "Jubin Nautiyal";
		s.eat();
		s.walk();
		Doctor d = new Doctor("mr. ankit");
		s.name = "S.K. Singh";
		s.eat();
		s.walk();
		
		Person p = t;    //up casting or implicit casting
		
		Teachear t1 = (Teachear)p;  // down casting or explicit casting
		
		boolean y = t1 instanceof Teachear;
		System.out.println(y);
		
		
	}

}
