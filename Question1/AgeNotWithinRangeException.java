package TASK4.Question1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AgeNotWithinRangeException extends Exception {

	public String toString()
	{
		return("Age is not between 15 and 21 … Please ReEnter the Age");
	}
	}
	class NameNotValidException extends Exception
	{
		public String validname()
		{
		return("Name is not valid...Please enter the name");
		}
	}
	class Student
	{
		int roll,age;
		String name,course;
	Student()
	{
		roll=0;
		name=null;
		age=0;
		course=null;
	}
	Student(int r,String n,int a,String c)
	{
		roll=r;
		course=c;
		int l,temp=0;
		l=n.length();
		for(int i=0;i<l;i++)
		{
			char ch;
			ch=n.charAt(i);
			if(ch<'A' || ch>'Z' && ch<'a' || ch>'z')
			temp=1;
		}
		//Name
		try
		{
			if(temp==1)
			throw  new NameNotValidException();
			else
			name=n;
		}
		catch(NameNotValidException e2)
		{
			System.out.println(e2);
		}
		// Age
		try
		{
			if(a>=15 && a<=21)
			age=a;
			else
			throw new AgeNotWithinRangeException();
		}
		catch(AgeNotWithinRangeException e1)
		{
			System.out.println(e1);
		}
	}
	void display()
	{
		System.out.println("roll name age course");
		System.out.println("----------------");
		System.out.println(roll+" "+name+" "+age+" "+course);
	}
}
