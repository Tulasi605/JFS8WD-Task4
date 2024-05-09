package TASK4;

import java.util.Stack;

public class stackdatastructure {
	public static void main(String[] args)
    {
 
        Stack<String> STACK = new Stack<String>();
 
        STACK.push("3");
        STACK.push("4");
        STACK.push("5");
        STACK.push("20");
        STACK.push("10");
 
        System.out.println("The stack is: " + STACK);

        System.out.println("stack empty? " +STACK.empty());

        STACK.pop();
        STACK.pop();
        STACK.pop();
        STACK.pop();
        STACK.pop();
 
        System.out.println("stack empty? " + STACK.empty());
    }
}
