import java.util.Scanner;

public class SwitcjConsonant {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter a character");
		String c = scan.next();
		System.out.println(c);
		
		switch(c) {
		case "a":
			System.out.println("the given character is vowel");
			break;
		case "e":
			System.out.println("the given character is vowe");
			break;
		case "i":
			System.out.println("the given character is vowe");
			break;
		case "o":
			System.out.println("the given character is vowe");
			break;
		case "u":
			System.out.println("the given character is vowe");
			break;
		default:
			System.out.println("the given character is Consonant");
				
		}
		
		}
	
}
