package string;
import java.util.*;

public class MatchString {

	public static void main(String[] args) {
		   Scanner s = new Scanner(System.in);
	          String s1 = "AEIOUaeiou";
	          int l1 = s1.length();
	         String name = "omahgoTuRuLob";
	         int l2 = name.length();
	        boolean isMatch = false;
	            for (int k =0; k<l1;k++)
	            {
	                char c = s1.charAt(k);
	                isMatch = false;
	                for(int j = 0; j<=l2;j++) 
					{
						if(name.charAt(j)==c)
	                    {
	                        isMatch = true;
	                        break;
	                    }
	                }
	                if(!isMatch)
	                {
	                    break;
	                }
	            }

			if(isMatch)
			{
				System.out.println("lovely string");
			}
			else
			{
				System.out.println("ugly string");	
			}

	}

}
