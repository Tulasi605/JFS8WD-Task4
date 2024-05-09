package TASK4;

import java.rmi.AccessException;
import java.util.Scanner;

public class weekdays {

	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int a=sc.nextInt();
		String str2[]= {"Sun","Tue","Wed","Thur","Fri","Sat","Mon"};
		for(int i=0;i<str2.length;i++) {
			try {   
				if(i==(a-1)) {
					System.out.print(str2[i]);
					break;
				}
				else {
					System.out.println("ArrayIndexOutOfBoundsException");
				}
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			finally {
				System.out.println(' ');
			}
	}
	}
	
}
