import java.util.Scanner;

public class Q2 {
//Check if a number is even or odd.
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("Enter a number: " );
		int n = sc.nextInt();
		
		if(n%2==0) {
			System.out.print(n+" is even");
		}else{
			System.out.print(n+" is odd" );
		}
		

	}

}
