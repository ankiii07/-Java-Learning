package keyword;

import keyword.StaticNestedClass.B;
import keyword.StaticNestedClass.C;

public class StaticKeyword {

	static
	{
		System.out.println("Homo Sapiens in Block 1");
	}
	static
	{
		System.out.println("Homo Sapiens in Block 2");
	}
	
	public static void main(String[] args) 
	{
		System.out.println(Math.PI);    // static class
		
	    StaticNestedClass obj = new StaticNestedClass();
	    B objnew = obj.new B();
	  //StaticNestedClass.B objnew = obj.new B();
	    
	    C objC = new StaticNestedClass.C();
	    
	    
	}

}
