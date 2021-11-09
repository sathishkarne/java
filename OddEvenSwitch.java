import java.util.Scanner;
public class OddEvenSwitch {
	public static void main(String args[]) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter a number");
		int x=scan.nextInt();
		int y=x%2;
		
		switch(y) {
		case 0:
			System.out.println("the given number is even number");
			break;
		case 1:
			System.out.println("the given number is odd number");
		}		
		
	}

}
