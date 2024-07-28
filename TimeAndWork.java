
import java.util.Scanner;

class TimeAndWork{
public static void main(String []args)
{
	/* The program will ask the user for the number of days
	 * it takes for A and B to complete the work alone, respectively.
	 * 
	 * After that , the program will output the 'no of days' 
	 * that A and B will take to complete the work if they 
	 * work together
	 */
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter the number of days taken by A to finish the work alone: ");
	float a = scanner.nextFloat();

	System.out.print("Enter the number of days taken by B to finish the work alone: ");
	float b = scanner.nextFloat();
	
	// One day work of A , B and A+B respectively
	// A->116 , B->118 A+B-> 1/{1/116+1/118}
	
	float answer = 1/(1/a+1/b);
	
	System.out.println("A and B will together take "+answer+" days to finish the job");


}
}
