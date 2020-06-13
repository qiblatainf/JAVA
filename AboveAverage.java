
public class AboveAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		double avg = 0;
		double x = 0;
		int [] a = new int[args.length];
		System.out.println("Arguments length: " + args.length);
		
		for (int i = 0; i < args.length; i++)
		{
			a[i] = Integer.parseInt(args[i]);
			sum = sum + a[i];
			avg = sum/(i+1);
			
		}
		
		for (int i = 0; i < args.length; i++)
		{
			if ((a[i] > avg) && (a[i] != avg))
			{
				x = x + 1;
				double fraction = x/(i+1);
				System.out.println("Fraction: " + fraction);
			}
		}
		System.out.println("Average: " + avg);
		System.out.println("Sum: " + sum);
	}

}
