
import java.util.Scanner;

public class Q5 {
//Check if a year is leap year or not
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("Enter a year: " );
		int n = sc.nextInt();
		
		if(n%4==0) {
			System.out.print(n+" is leap year");
		}else if(n%100==0){
			System.out.print(n+" is leap year" );
		}else if(n%400==0) {
			System.out.print(n+" is leap year" );
		}else {
			System.out.print(n+" is not a leap  year" );
		}
		

	}

}
