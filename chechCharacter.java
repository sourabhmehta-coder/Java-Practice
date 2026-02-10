import java.util.Scanner;

public class Q10 {
	

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter a value for x: ");
		 char ch = sc.next().charAt(0);
		 
		 if(ch>='A' && ch<='Z') {
			 System.out.print(ch+" is Uppercase");
		 }else if(ch>='a' && ch<='z') {
			 System.out.print(ch+" is Lovercase");
		 }else if(ch>='0' && ch<='9') {
			 System.out.print(ch+" is a digit ");
		 }else {
			 System.out.print(ch+" is  special character");
		 }
		
		

	}

}
