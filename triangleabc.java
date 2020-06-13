
public class triangleabc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int n = Integer.parseInt(args[0]);

        for ( int i = 1; i <= n; i++)
        {
        	for (int j = i + 1; j <= n-1; j--)
        	{
        		System.out.print("* ");
        	}
        	System.out.println();
        }
	}

}
