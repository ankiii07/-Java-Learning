package string;

public class Anagram3 {

	public static void main(String[] args) {
		
		String a = "silent";
		String b = "listen";
		
		boolean isAnagram = true;
		
		int al[] = new int[256];
		
		for(char c: a.toCharArray())
		{
			int index = (int)c;
			al[index]++;
		}
		
		for(char c: a.toCharArray())
		{
			int index = (int)c;
			al[index]--;
		}
		
		for(int i = 0 ; i<256;i++)
		{
			if(al[i] == 0)
			{
				isAnagram = true;
				break;
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
