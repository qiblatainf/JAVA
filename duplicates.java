
public class duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ABBCCCCCBBAB ";
		boolean repeated = false;
		String t = "";
		
		for (int i = 0; i < s.length()-1; i++)
		{
			char c = s.charAt(i);
			char d = s.charAt(i + 1);
					
			repeated = (d == c);
					
			if (repeated == true)
				t = t + c;
			else
				System.out.print(c);
				
		
		}
	}

}
