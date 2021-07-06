package encapsulation;

public class Encapsulation {

	public static void main(String[] args) {
		
		Students s1 = new Students();
		
		s1.name = "Ankit";
		s1.age = 19;
		s1.height = 171;
		s1.setName("Yadav");
		s1.setAge(25);
		
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.height);

	}

}
