import java.util.Scanner;

public class Q7 {
//take three number and print larger one
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("Enter first No: " );
		int n = sc.nextInt();
		System.out.print("Enter Second No: " );
		int m = sc.nextInt();
		System.out.print("Enter Third No: " );
		int o = sc.nextInt();
		
		if(n>m && n>o) {
			System.out.print(n+" is grater than "+m+" and "+o);
		}else if(m>n &&m>o) {
			System.out.print(m+ " is grater than "+n+" and "+o);
		}else  {
			System.out.print(o+" is grater than "+m+" and "+n);
		}
		
	
		

	}

}
