package pakeges;

import java.util.Scanner;

import pakeges.models.Student;
import pakeges.models.Teacher;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		Student obj = new Student("Ankit");
		
		Teacher teacher = new Teacher();   // protected access modifier
		teacher.getPassword(); 

	}

}
