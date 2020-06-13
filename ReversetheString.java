
public class ReversetheString {
	
	public static boolean isReverse(String s1, String s2) {

		if (s1.length() != s2.length()) return false;
		else if (s1.length() == 0 && s2.length() == 0) return true;
		return s1.charAt(0) == s2.charAt(s2.length() - 1) 
				&& isReverse(s1.substring(1, s1.length()), 
						s2.substring(0, s2.length() - 1));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "cat".toLowerCase();
		String s2 = "tac".toLowerCase();
		System.out.println(isReverse(s1, s2));

	}

}
