
public class RepeatingWords {
	
	public static String repeat(String s, int n) {
		
		if (n==0) return "";
		return s + repeat(s, n -1);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "This is fun";
		int n = 3;
		System.out.println(repeat(s,n));
	}

}
