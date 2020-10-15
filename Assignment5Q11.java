package Assignment5Loops;

public class Assignment5Q11 {

	public static void main(String[] args) {
		
		
//			Question-11:
//
//			Print the following output using nested for loops.
//
//			4       3       2      1
//
//			     3       2      1
//
//			         2       1
//
//			              1
		
		
		int rows=4;
		
		int m=rows; //copy 'n'
		for(int i=1;i<=rows;i++) {	//for each row of elements			
		for(int x=1;x<i;x++) 	{ 
			System.out.print("    "); 
			}     //for each element less, add spaces
		for(int j=m; j>=1; j--) { 
			System.out.print(j + "       ");
			} //print the column of elements
			m--;
			System.out.println("");  //add an enter
			System.out.println("\n");     			   //decrement the number of rows without affecting 'n'
		}
			
		
		
		
		
		

	}

}
