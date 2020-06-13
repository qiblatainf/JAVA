
public class Checkerboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StdOut.print("Enter the input n: ");
		int n = StdIn.readInt();
		StdDraw.setXscale(0,n);
		StdDraw.setYscale(0,n);
		
		for (int y = 1; y <= n; y++)
		{
			for (int x = 1; x <= n; x++)
			{
				
				if ((x+y)%2 == 0)
					StdDraw.setPenColor(StdDraw.BLACK);
				else
					StdDraw.setPenColor(StdDraw.RED);
	
				StdDraw.filledSquare(x,y,1);
		
			}
		}
		
	}

}
