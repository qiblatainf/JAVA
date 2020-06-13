
public class ConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int [] a = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			a[i] = (int)(Math.random() * 2);
			System.out.print(a[i] + " ");
			
		}
		System.out.println();
		
		int count = 0 ;
		int max = 0;
		for(int i = 0; i < n; i++)
		{
			if(a[i]==1)
			{
				count++;
				if (count > max)
				{
					max = count;
				}
			}
			else if (a[i] == 0)
			{
					count=0;
				
			}
				
		}
		System.out.println();

		System.out.println("Max consecutive One's: " + max);
	}

}
