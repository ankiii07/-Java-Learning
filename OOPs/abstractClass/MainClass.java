package abstractClass;

public class MainClass {

	public static void main(String[] args) 
	{
		WagonR wagonR = new WagonR();
		Audi audi = new Audi(); 
		
		repairCar(wagonR);
		repairCar(audi);

	}
	public static void repairCar(Car car)
	{
		System.out.println(" car is repaired");
	}
//	public static void repairCar(Audi car)
//	{
//		System.out.println("Audi car is repaired");
//	}

}
