import java.util.Scanner;

public class Add {
	
	public static void main(String[] args) {
		int a,b,sum;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers to add : ");
		a=scan.nextInt();
		b=scan.nextInt();
		sum=a-(-b);   //sum = a+b(here,addition is done without + operator)
		System.out.println("Sum = "+sum);
	}
}
