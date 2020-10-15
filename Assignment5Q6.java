package Assignment5Loops;

public class Assignment5Q6 {

	public static void main(String[] args) {


//			Question-6:
//			Write a program to print Fibonacci series of n terms where n is declared 
//			by user :  0, 1, 1, 2, 3, 5, 8, 13, 21, 34,......
			
		
		 int n = 20;
		 int previousNum = 0; 
		 int nextNum = 1;
	        
		 System.out.print("Fibonacci Series of "+n+" numbers: ");

	        int i=1;
	        while(i<=n) {
	            System.out.print(previousNum+", ");
	            int sum = previousNum + nextNum;
	            previousNum = nextNum;
	            nextNum = sum;
	            i++;
		
		} 
		
		
		
		
		
		

	}

}
