package dm;

public class StringMatching {

	public static int Match(String P, String S) {
		int n = P.length();
		int m = S.length();
		
		for (int i = 0; i <= n - m; i++) {
			int j = 0;
			while (j < m && (P.charAt(i+j) == S.charAt(j))) {
				j++;
				if (m == j)
					return i;
			}
			
		}
		return -1;
		
		      
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String P = "I love Programming";
		String S = "Programming";
		System.out.println(Match(P, S));
	}
	
}
