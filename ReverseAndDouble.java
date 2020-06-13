
public class ReverseAndDouble {
	
	public static String doubleReverse(String s) {
		
		if (s.length() == 0) return s;
		return doubleReverse(s.substring(1)) + s.charAt(0) + s.charAt(0);
	}

	public static void main(String[] args) {
		
		String s = "hello";
		System.out.println(doubleReverse(s));

	}

}
