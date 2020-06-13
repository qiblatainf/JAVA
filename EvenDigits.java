public class EvenDigits {

	
	public static int EvenDigit(int n) {
	
		if (n == 0) return 0 ;
	
		int a = n % 10;
		
		if ( a % 2 == 0) return (10 * EvenDigit(n / 10)) + a;
		
		return EvenDigit(n/10);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = -34512;
		System.out.println(EvenDigit(n));
	}

}
