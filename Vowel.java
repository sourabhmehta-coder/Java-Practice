import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
		
		System.out.print("Enter the alpabet A to Z: " );
		char  x = sc.next().charAt(0);	
		
		if(x=='a'||x=='A') {
			System.out.print(x+" is Vowel");
		}else if(x=='e'||x=='E') {
			System.out.print(x+" is Vowel");
		}else if(x=='i'||x=='I') {
			System.out.print(x+" is Vowel");
		}else if(x=='o'||x=='O') {
			System.out.print(x+" is Vowel");
		}else if(x=='u'||x=='U') {
			System.out.print(x+" is Vowel");
		}else  {
			System.out.print(x+" is not Vowel");
		}





	}

}
