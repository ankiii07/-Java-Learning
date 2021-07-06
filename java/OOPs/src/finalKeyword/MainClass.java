package finalKeyword;

public class MainClass {

	public static void main(String[] args) {
		
		String name = "Ankit";
		name = "Ankur";
		
		final String lastName = "Yadav";
		// lastName = "Kumar";   here we initialize the final variable the we cannot place any value further in this
		
		final int rollNo = 15; //initialize is necessary
		
		final long UNOVERSITY_ROLL_NO = 190020016;
		
		Student obj = new Student();
		
		Student obj2 =new Student();
		
		obj =obj2;
		
		final Student obj3 = new Student();
	    
		Student obj4 = new Student();
		
		// obj3 = obj4; we do not write this due to final of keyword Student
		 
	}

}
