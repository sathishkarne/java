import java.util.Scanner;

public class MonthIdent {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println(" enter starting 3 letters of a month in small letters");
		String month=scan.next();
		System.out.println(month);
		
		switch(month) {
		case "jan":
			System.out.println(" it is january");
			break;
		case "feb":
			System.out.println(" it is febrauary");
			break;
		case "mar":
			System.out.println(" it is march");
			break;
		case "apr":
			System.out.println(" it is april");
			break;
		case "may":
			System.out.println(" it is may");
			break;
		case "jun":
			System.out.println(" it is june");
			break;
		case "jul":
			System.out.println(" it is july");
			break;
		case "aug":
			System.out.println(" it is august");
			break;
		case "sep":
			System.out.println(" it is september");
			break;
		case "oct":
			System.out.println(" it is october");
			break;
		case "nov":
			System.out.println(" it is november");
			break;
		case "dec":
			System.out.println(" it is december");
			break;
		default:
			System.out.println(" invali deatails");
		}
	}

}
