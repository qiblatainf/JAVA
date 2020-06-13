
public class DivisorPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 //Prints a table where entry (i, j) is a '* ' if i divides j or j divides i and ' ' otherwise.
		
        int n = Integer.parseInt(args[0]); //takes input for the number of lines vertically and horizontally

        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= n; j++) 
            {
                if (i % j == 0 || j % i == 0) 
                {
                    System.out.print("* "); 
                }
                else 
                {
                    System.out.print("  "); 
                }
            }
            System.out.println(i);
        }
	}

}
