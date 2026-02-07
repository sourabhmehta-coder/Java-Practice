import java.util.Scanner;

public class Q6 {
//take two number and print larger one
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("Enter first No: " );
		int n = sc.nextInt();
		System.out.print("Enter Second No: " );
		int m = sc.nextInt();
		
		if(n>m) {
			System.out.print(n+" is grater than "+m);
		}else {
			System.out.print(m+ " is grater than "+n);
		}
		
	
		

	}

}
