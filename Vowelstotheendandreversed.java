
public class Vowelstotheendandreversed {
	
	public static String vowelsToEnd(String s) {
		if (s.length() == 1) return "" + s.charAt(0);
		
		char x = s.charAt(0);
		if (x != 'a' || x != 'e' || x != 'i' || x!= 'o' || x!= 'u')
			return s.charAt(0) + vowelsToEnd(s.substring(1, s.length()));
		return vowelsToEnd(s.substring(1, s.length()))+ s.charAt(0);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "beautifully";
		System.out.println(vowelsToEnd(s));
	}

}
