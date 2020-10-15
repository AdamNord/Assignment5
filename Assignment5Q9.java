package Assignment5Loops;

public class Assignment5Q9 {

	public static void main(String[] args) {


//			Question-9:
//			Write a program for the following logic:
//			Print all the odd numbers in comma-separated form from 1 till the end (you may change it):
//			if end = 10, OUTPUT = 1, 3, 5, 7, 9
//			if end = 11, OUTPUT = 1, 3, 5, 7, 9, 11
//			You should use while loop and if-else statements. Note that, there should not be any comma 
//			after the last digit.
		
		int end=60;
		int i=1;
		while(i<=end) {
			if((end%2!=0 && i==end )|| (end%2==0 && i==(end-1))) {
				System.out.print(i);
			}else if (i%2!=0) {
				System.out.print(i + ", ");
				
				}
			i++;
			}

				
			}
			
		}
		
		
		
		




