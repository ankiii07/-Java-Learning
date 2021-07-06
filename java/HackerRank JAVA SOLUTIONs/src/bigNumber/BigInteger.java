package bigNumber;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BigInteger {

	    public BigInteger(String trim) {
		// TODO Auto-generated constructor stub
	}

		public static void main(String[] args) throws IOException{
	       
	       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	       BigInteger result1;
	       BigInteger result2;
	       BigInteger num1 = new BigInteger(bufferedReader.readLine().trim());
	       BigInteger num2 = new BigInteger(bufferedReader.readLine().trim());
	       result1 = num1.add(num2);
	        result2 = num1.multiply(num2);
	       System.out.println(result1);
	       System.out.println(result2);
	    }

		private BigInteger add(BigInteger num2) {
			// TODO Auto-generated method stub
			return null;
		}

		private BigInteger multiply(BigInteger num2) {
			// TODO Auto-generated method stub
			return null;
		}
	}

