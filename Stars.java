
public class Stars {
	
	public static String starString(int n) {
		
		if (n==0) return "*";
		return starString(n-1) + starString(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3;
		System.out.println(starString(n));
	}

}
