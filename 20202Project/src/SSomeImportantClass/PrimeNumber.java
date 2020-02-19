package SSomeImportantClass;

public class PrimeNumber {

	// 2 is the lowest prime number

	public static boolean isPrimeNumber(int num) {

		if (num <= 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void getPrimeNumber(int num) {

		for (int i = 2; i <= num; i++) {
			if (isPrimeNumber(i))
				System.out.println(i + "  ");
		}
	}

	public static void main(String[] args) {

		System.out.println("the entered number is prime numer : " + isPrimeNumber(55));
		System.out.println("the entered number is prime numer : " + isPrimeNumber(23));
		System.out.println("the entered number is prime numer : " + isPrimeNumber(67));

		getPrimeNumber(7);

	}

}
