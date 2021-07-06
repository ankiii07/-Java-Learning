package string;

public class Anagram
{

	public static void main(String[] args) 
	{
		  
		String a = "silent";
		String b = "lissten";
		boolean isAnagram = false;
		boolean isVisited[] = new boolean[b.length()];
		
		if(a.length()==b.length())
		{
		
			for (int i =0; i<a.length();i++)
			{    
				isAnagram = false;
				char c = a.charAt(i);
				for(int j = 0; j<b.length();j++) 
				{
					if(b.charAt(j)==c && !isVisited[j])
					{
						isVisited[j] = true;
						isAnagram = true;
						break;
					}
				}
				if(isAnagram) {
					break;
				}
			}
		}
		if(isAnagram)
		{
			System.out.println("String is Anagram");
		}
		else
		{
			System.out.println("String is not Anagram");	
		}
		
	}

}
