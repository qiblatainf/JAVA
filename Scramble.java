
public class Scramble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "right";
		String t = "";
		String temp = "";
		

		char c = s.charAt(0);
		char d = s.charAt(s.length()-1);
		
		for (int i = 0; i < s.length(); i++) 
		{
			String [] a = new String[s.length()];
			int r = i + (int) (Math.random() * (s.length()-i));
			temp = a[r];
            a[r] = a[i];
            a[i] = temp;
            t = t + c + a[i] + d;
		}
            
		
		System.out.print(t);
	}

}
