package SSomeImportantClass;

public class PalinDromeNumber {
	
	
	public static void isPalinDromeNumber(int num) {
		
		int r =0;
		int sum=0;
		int t;
		
		t=num;
		
		while(num>0) {
			r = num% 10 ;  // get the remainder
			 sum =(sum * 10)+ r ;
			 num = num/10 ;
			 		}
		if (t==sum) {
			System.out.println("It is an Palindrome numer");
			
		}else {System.out.println("Is not an palindrome number ");}
		
		
	}
	
	
	

	public static void main(String[] args) {
		
		
		isPalinDromeNumber(352);

	}

}
