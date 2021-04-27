package string;

public class FunctionInString {

	public static void main(String[] args) {
		
		String name = "Ankit Yadav";
		String name2 = new String("Ankit");
		
		System.out.println(name.charAt(0));
		
		System.out.println(name.length());
		
		System.out.println(name.substring(4));
		
		System.out.println(name.substring(3, 8));
		
		System.out.println(name.contains("t Ya"));
		//Returns true if and only if this string contains the specifiedsequence of char values
		
		System.out.println(name.equals(name2));
		//Compares this string to the specified object. The result is true if and only if the argument is not null and is a String object
		//that represents the same sequence of characters as this object. 
		
		System.out.println(name.isBlank()); 
		//Returns true if the string is empty or contains only white space codepoints,otherwise false.
		
		System.out.println(name.isEmpty());
		//Returns true if, and only if, length() is 0
		
		System.out.println(name.concat(name2));
		
		System.out.println(name.replace('k', 'l'));
		
		String cars = "Hyundai,Maruti,ferrari,honda,wagnor";
		
		String allcars[] = cars.split(",");
		
		for(String item: allcars)
		{
			System.out.println(item+ " ");
		}
		
		System.out.println(cars.indexOf('f'));
		
		System.out.println(cars.toLowerCase());
		
		System.out.println(cars.toUpperCase());
		
		String name3 = "     ankit     yadav      ";
		System.out.println(name3);
		System.out.print(name3.trim());
	}

}
