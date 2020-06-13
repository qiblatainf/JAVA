
public class MultiplyEvens {
	
	public static String multiplyEvens(int n) {
		
		if (n==1) return "2";
		return multiplyEvens(n-1) + " * " + (n*2);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		System.out.println(multiplyEvens(n));
	}

}
