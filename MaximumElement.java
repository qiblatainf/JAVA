
public class MaximumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] a = new int[5];
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int sum = 0;
		double avg = 0;
		
		for (int i = 0; i < a.length; i++)
		{
			int r = (int)(Math.random() * 10);
			a[i] = r;
			System.out.println(a[i] + " ");
	
			if (a[i] > max)
				max = a[i];
			
			if (a[i] < min)
				min = a[i];	
			sum = sum + a[i];
			avg = sum/(i+1);
		}

	
		System.out.println("Max element = " + max);
		System.out.println("Max element = " + min);
		System.out.println("Average = " + avg);
	}

}
