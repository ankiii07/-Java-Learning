package string;
import java.util.*;

public class Coronavirus {
	
	public static void main(String[] args)
	{
	     Scanner s=new Scanner(System.in);
		 System.out.println("virus");
		 String v=s.nextLine();
		 System.out.println("tested people");
		 int n=Integer.parseInt(s.nextLine());
		 System.out.println("virus composition");
		 String B[]=new String[n];
		 for(int i=0;i<n;i++) 
		 {
			 B[i]=s.nextLine();
		 }
		 for(int i=0;i<n;i++)
		 {
			 boolean res = isSubSequence(v, B[i]);
			 if (res)
		    	 System.out.println("POSITIVE");
		    else
		    	System.out.println("NEGATIVE");
		  }
	}
 static boolean isSubSequence(String str2, String str1)
 {
int j = 0;
 int flag=0;
for(int i = 0; i < str2.length(); i++)
{
	if(str1.charAt(j) == str2.charAt(i))
	{
		++j;
	}
		    		       
	if(j == str1.length())
	{
		 flag=1;
		 break;
	}
}
if(flag==1)
	return true;
else
	return false;
 }
}

}
