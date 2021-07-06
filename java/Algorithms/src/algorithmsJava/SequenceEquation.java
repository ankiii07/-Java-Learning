package algorithmsJava;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class SequenceEquation {

	public static void main(String[] args) throws IOException {
		 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        List<Integer> p = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(toList());

	        List<Integer> result = Result.permutationEquation(p);

	        bufferedWriter.write(
	            result.stream()
	                .map(Object::toString)
	                .collect(joining("\n"))
	            + "\n"
	        );

	        bufferedReader.close();
	        bufferedWriter.close();
		
	}
	
	static class Result {
	    public static List<Integer> permutationEquation(List<Integer> p) 
	    {
	        ArrayList<Integer> result = new ArrayList<Integer>();
	        for(int y = 1 ; y <= p.size() ; y++)
	        for(int i = 0 ; i < p.size() ; i++)
	            if(p.get(p.get(i) - 1) == y)
	            {
	                result.add(i + 1);
	                break;
	            }
	    return result;
	        
	    }

	}
}
