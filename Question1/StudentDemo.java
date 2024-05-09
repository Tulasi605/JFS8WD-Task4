package TASK4.Question1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentDemo {
	public static void main(String args[])throws IOException
	{

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int r,a;
	String n,c;

	System.out.println("Enter roll,name,age,course");

	r=Integer.parseInt(br.readLine());
	n=br.readLine();
	a=Integer.parseInt(br.readLine());
	c=br.readLine();
	Student s=new Student(r,n,a,c);
	s.display();
	}
}
