package dolly.java1;

public class Variable {

 static int a=10;//static variable
int b=20;//instance variable

public static void main(String[]args) {
	String name="Lisa";// local variable
	
	if (name=="rain") {
	System.out.println("bring umbrella");
	}
	
	else if (name=="sunny") {
		System.out.println("bring hat");
	}
	
	else if (name=="snow") {
		System.out.println("bring coat");
	}

	else if (name=="cloudy") {
		System.out.println("bring jaket");
		}

	else {
			System.out.println("stay home");
	}
}
}





