
public class Sequence {
	
	public static String writeSequence(int n) {
		
		if (n == 0) return " ";
		else if (n == 1) return "1";
		else if (n == 2) return "1  1" ;
		else if ( n % 2 == 0)
		{
			return n/2 + " " + writeSequence(n - 2) + " " + n/2;
		}
		return (n/2 + 1) + " " + writeSequence(n - 2) + " " + (n/2 + 1);
	
		
	}
	public static void main(String[] args) {
		int n = 9;
		System.out.println(writeSequence(n));
	}


}
