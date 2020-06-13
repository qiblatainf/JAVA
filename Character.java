public class Character {

	public static String writeChars(int n) {
		
		if (n==0) return "";
		if (n==1) return "*";
		if (n==2) return "**";
		return "<" + writeChars(n-2) + ">";
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 7;
		System.out.println(writeChars(n));
	}

}
