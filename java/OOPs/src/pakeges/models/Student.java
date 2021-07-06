package pakeges.models;

public class Student 
{
	public String name;
	
	public Student(String name)
	{
		this.name=name;
	}
	
	public String getname() {
		return name;
	}
	public static void main(String[] args)
	{
		Teacher obj = new Teacher();  // default access modifier
		obj.getHack();
	}

}
