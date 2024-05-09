package TASK4;

public class voter{
	public static void print(int age, String name, String voterid) {
		if(age>=18){ 
	          System.out.println("Eligible for Voting"); 
	          } 
	          else{ 
	     
	          throw new IllegalArgumentException("Invalid age for voter"); 
	                                     
	          } 
	}

	public static void main(String[] args) { 
		voter.print(19,"guvi","juhyg7163");  
		
   }
      
	
}
