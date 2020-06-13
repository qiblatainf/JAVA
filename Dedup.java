public class Dedup {
	
	public static String dedup(String s){
	    if (s.length() == 1) return s;
	    char x = s.charAt(0);
	    if (x == s.charAt(1))
	        return dedup(s.substring(1));
	    return x + dedup(s.substring(1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "bookkkkkeeper";
		System.out.println(dedup(s));
	}

}
