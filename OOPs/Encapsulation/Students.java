package encapsulation;

public class Students 
{
	 int age;
	 String name;
	 int height;
	
	// get set method 
	
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		if(name.length()==5)
		{
			System.out.println(name);
		}
		else
		{
			this.name = name;
		}
	}
	
	
	// get set method  
	
	
	public int getAge()
	{
		return age;
	}
    
	public void setAge(int age)
	{
		if(age>20)
		{
			System.out.println("you are too old to be student");
		}
		else {
		this.age = age;
	}
	}
}
