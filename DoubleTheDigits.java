
public class DoubleTheDigits {
	
	public static String doubleDigits(int x) {
		
		if (x <= 0) return "0";
		if (x % 10 == x) return "" + x + x;
		return doubleDigits(x/10) + (x % 10) + (x % 10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3292;
		System.out.println(doubleDigits(n));
	}

}
