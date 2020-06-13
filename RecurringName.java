
public class RecurringName {
	
	public static char mostFrequentWord(String s, int i) {
		
	
		 char a = s.charAt(i);
		 if(java.lang.Character.isUpperCase(a))
			return (a + mostFrequentWord(s.substring(s.indexOf(a)), i+1));
			 
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Ben  Eric".replace(" ", "");
		int i = 0;
		System.out.println(mostFrequentWord(s,i));
		System.out.println(s);
	}

}
