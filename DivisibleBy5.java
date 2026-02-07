
import java.util.Scanner;

public class Q3 {
//Check if a number is divisible by 5 or not.
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("Enter a number: " );
		int n = sc.nextInt();
		
		if(n%5==0) {
			System.out.print(n+" is divisible By 5");
		}else{
			System.out.print(n+" is not divisible by 5" );
		}
		

	}

}
