import java.util.Scanner;

public class Q1 {

	
	//Take a number and print whether it’s positive, negative, or zero.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter  a number: ");
		int x = sc.nextInt();
		
		if(x>0) {
			System.out.print(x+" is Positive Number");
			
		}else if(x<0) {
			System.out.print(x+" is Negative Number");
			
		}else {
			System.out.print(x+" is zero");
		}

	}

}
