
public class NotAlone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = new int[args.length];
		for (int i = 0; i < args.length; i++)
			a[i] = Integer.parseInt(args[i]);
					
		for (int i = 1; i < args.length-1; i++)
		{

			if ((a[i] != a[i + 1]) && (a[i] != a[i-1]))
			{
				if (a[i-1] < a[i + 1]) 
				{
					a[i] = a[ i + 1];
					//System.out.print(a[i]);
				}
				else 
				{
					a[i] = a[i - 1];
					//System.out.print(a[i]);
				}
			}

		}
		
		for (int i = 0; i < args.length; i++)
			System.out.print(a[i] + " " );
	}

}
