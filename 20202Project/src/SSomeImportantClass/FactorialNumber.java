package SSomeImportantClass;

public class FactorialNumber {

	public static int factorial(int num) {
		int fact = 1;

		for (int i = 1; i <= num; i++) {
			fact = fact * i;

		}
		return fact;

	}

	public static void main(String[] args) {

		// factorial number is : fact of 5 is 5*4*3*2*1= ?
		// factorial 0 is =1

		System.out.println(factorial(6));

	}

}
