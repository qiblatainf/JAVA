
public class ReverseString {
	
	
	public static String mystery4(String s) {
		
		int N = s.length();
		if (N <= 1) return s;
		String a = s.substring(0, N/2);
		String b = s.substring(N/2, N);
		return mystery4(b) + mystery4(a);
	}
	
	public static void main(String[]args) {

		String s = "cart";
		System.out.println(mystery4(s));


	}

}	

		
	


