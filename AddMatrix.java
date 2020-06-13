public class AddMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = { {2, 5, 7}, {1, 3, 6}, {5, 4, 1} };
		int[][] b = { {1, 9, 5}, {7, 1, 5}, {3, 4, 2} }; 
		
		int [][] c = new int[a.length][a.length];
		
		
		
		for (int i = 0; i < a.length; i++ )
		{
			for (int j = 0; j < a.length; j++)
			{
				c[i][j] = a[i][j] + b[i][j] ;
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
			
		}
	}

}
