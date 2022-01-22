
public class CalculatorApp {
	public static void main(String[] args) {
		Arithmetics ar = new Arithmetics();
		//Input in = new Input();
		ar.a = ar.readInt("Enter first number ");
		ar.b = ar.readInt("Enter second number ");
		ar.addition();
		ar.difference();
		ar.product();
		ar.division();
		}

}
