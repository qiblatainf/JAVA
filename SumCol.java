
public class SumCol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int j = 2; //Integer.parseInt(args[0]);
		int[][] a = { {2, 5, 7}, {1, 3, 6}, {5, 4, 1} };
		int sum = 0;
		
		
		for (int i = 0; i < a.length; i++ )
		{
			sum = sum + a[i][j];
		}
		System.out.print(sum);
		
	}

}
