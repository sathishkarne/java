//Constructor
public class Maths {
	int a,b;
	void addidtion() {
		System.out.println("the addidtion is"+(a+b));
	}
	
	void substraction() {
		System.out.println("The difference is"+(a-b));
	}
	
	//Default constructor or non parameterized constructor
	Maths() {
		System.out.println("The Constructor has been called");
	}
	
	//parameterized constructor
	Maths(int x, int y){
		System.out.println(" it is a parameterized constructor");
		a=x;
		b=y;
		
	}
	
	//Maths(int a, int y){
		//System.out.println(" it is a parameterized constructor");
		//this keyword is used to call the class members of the current class
		//the 'this' keyword is mainly used to differentiate the class variables form the local variable
		//this.a=x;
		//b=y;
		
	//}
	
	public static void main(String[] args) {
		//Maths m=new Maths();
		Maths m=new Maths(60,40);
		//m.a=15;
		//m.b=5;
		m.addidtion();
		m.substraction();
	}
}
