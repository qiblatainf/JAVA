
public class EvenOddarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int [] a = new int[args.length];
		
		for (int i=0; i <a.length; i++)
		{
			a[i] = Integer.parseInt(args[i]);
			int [] b = new int[i];
			if (a[i] % 2 == 0)
			{
				b[i] = a[i];
				System.out.println(b[i] + "");
			}
			
		}
	}

}
