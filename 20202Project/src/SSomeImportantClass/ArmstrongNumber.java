package SSomeImportantClass;

public class ArmstrongNumber {

	public static void isArmstrongNumber(int num) {

		int cube = 0;
		int r;
		int temp;

		temp = num;

		while (num > 0) {

			r = num % 10;
			num = num / 10;
			cube = cube + (r * r * r);
		}

		if (temp == cube) {

			System.out.println("The given number is an Armstrong number ");
		} else {
			System.out.println("The given number is not an Armstrong Number");
		}

	}

	public static void main(String[] args) {

		// 153 given : 1*1* + 5*5*5 + 3*3*3 = 153
		
		
		isArmstrongNumber(353 );
		
		
		

	}

}
