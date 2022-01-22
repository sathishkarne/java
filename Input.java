import java.util.Scanner;

public class Input {
	//Data member
	Scanner scan = new Scanner(System.in);
	int readInt(String msg){
	System.out.println(msg);
	int x = scan.nextInt();
	return x;
	}
	String readString(String msg) {
	System.out.println(msg);
	String x = scan.next();
	return x;
	}
	float readFloat(String msg) {
	System.out.println(msg);
	float x = scan.nextFloat();
	return x;
	}

}
