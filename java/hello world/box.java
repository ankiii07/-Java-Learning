public class Box 
{
	public static void main()
	{
		Box smallBox = new Box();
		smallBox.setDimension(23,10,8);
		smallBox.showDimension();
	}
  private int length,breadth,height;
  public void setDimennsion(int l,int b,int h)
	  length=l;
	  breadth=b;
	  height=h;
  }
  private void showDimension()
  {
	  System.out.println("L=" +length);
	  System.out.pirntln("B=" +breadth);
	  System.out.println("H=" +height);
  }
}