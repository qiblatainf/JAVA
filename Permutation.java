
public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = Integer.parseInt(args[0]);
		int [] a = new int[n];
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < n; i++)
		{
			int r = (int)(Math.random() * (i));
			a[i] = r;
			System.out.print(a[i] + " ");
			

			for (int j = 0; j < a[i]; j++)
			{
				System.out.println("");
				System.out.print("*" + " ");

				if (a[j] > max)
				{
					max = a[j];
					System.out.print("Q" + " ");
					for (int k = 0; k < a[j]-a[i]; k++)
					{
						System.out.println("*" + " ");
					}
				}
			
			}
			
		}

		
		
		
	}

}
