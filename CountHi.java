
public class CountHi {
	
	public static int countHi(String s) {
	
		int n = s.length();
		
		if (!s.contains("hi")) return 0;
		return countHi(s.substring(s.indexOf("hi")+2, n)) + 1;
	}
	
	public static void main(String[] args) {

		String s = "xxhixxhihi";
		System.out.println(countHi(s));
		System.out.println(s.indexOf("hi"));
		
	}

}
