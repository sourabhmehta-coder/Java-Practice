import java.util.Scanner;

public class Q4 {
//Check if a number is divisible by 3 & 5
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("Enter a number: " );
		int n = sc.nextInt();
		
		if(n%3==0 && n%5==0) {
			System.out.print(n+" is divisible By 3 & 5");
		}else{
			System.out.print(n+" is not divisible by 5 & 3" );
		}
		

	}

}
