package methods;

//No Argument  constructor

class Vehicle
{
	int wheels;
	int headlights;
	Vehicle()
	{
		wheels = 4;
		headlights = 2;
	}
}

// parametrised constructor
class Vehicles
{
	String color;
	int wheels;
	Vehicles(int noOfWheels)
	{
		wheels = noOfWheels;
		color = "red";
	}
	Vehicles(int noOfWheels, String color)
	{
		wheels = noOfWheels;
		this.color = color;
}

class Motar
{
	int wheels;
	Motar(int Wheels)
	{
		this.wheels = Wheels;
	}
}
public class Constructor {
	
		public void main(String[] args)
		{
			
			Vehicle car = new Vehicle();
			System.out.println(car.wheels + " Wheels");
			System.out.println(car.headlights + " headlights");
			
			Vehicles truck = new Vehicles(10, "green");
			System.out.println(truck.wheels + " Wheels and color is "+truck.color);
			
			Motar bolero = new Motar(4);
			System.out.println(bolero.wheels+" wheels");

		}

 }
}