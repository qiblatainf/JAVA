
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Racecar";
		s = s.toLowerCase();
		int n = s.length();
		boolean isPalindrome = true;
		
		for (int i=0; i < n; i++)
		{
			char c = s.charAt(i);
			char d = s.charAt(n - i-1);
			if (c!=d)
				isPalindrome = false;
		}
		System.out.println(isPalindrome);
	}

}
