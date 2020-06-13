
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Desperation".replace(" ", "");
		s = s.toLowerCase();
		String t = "A Rope Ends it";
		t = t.toLowerCase().replace(" ","");
		
		boolean isAnagram = true;
		
		for ( int i = 0; i <s.length(); i++)
		{
			String c = s.charAt(i) + "";
			if (t.contains(c))
			{
				t = t.replaceFirst(c,  "");
				System.out.println(t);
			}
			else 
				isAnagram = false;
		
			
		}
		System.out.println(isAnagram);
	}

}
