
public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = Integer.parseInt(args[0]);
		int [] a = new int[N];
		double sum = 0;
		double avg = 0;
		
		for (int i = 0; i < a.length; i++)
		{
			int r = (int)(Math.random() * 11);
			a[i] = r;
			System.out.print(a[i] + " ");
			sum = sum + a[i];
			avg = sum/(i+1);
					
		}
		System.out.println();
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + avg);
	}

}
