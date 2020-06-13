
public class EndZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = new int[args.length];
		
		
		for (int i = 0; i < args.length; i++)
			a[i] = Integer.parseInt(args[i]);
		
		for (int i = 0 ; i < args.length-1; i++)
		{
			
			if (a[i] == 0)
			{
				if (a[i+1] != 0)
				{
					a[i] = a[i + 1];
					a[i +1] = 0;
							
				}
			}
				
		}
		
		for (int i = 0; i < args.length; i++)
		{
			System.out.print(a[i] + " " );
		}
	}

}
