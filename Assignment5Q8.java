package Assignment5Loops;

public class Assignment5Q8 {

	public static void main(String[] args) {


//	Question-8:
//	Write a program to calculate the sum of the numbers from 1 till upper bound.
//	If upper bound is 5, sum should be 1 + 2 + 3 + 4 + 5 = 15.
//	If upper bound is 11, sum should be 1 + 2 + ... + 11 = 66.
//	If upper bound is 100, sum should be 1 + 2 + ... + 100 = 5050.		
				
		int upperBound=100;
		int i=1;
		int sum=0;
		while(i<=upperBound) {			
			
			sum=sum+i;
			i++;
		}
			System.out.println(sum);
			
		
		

	}

}
