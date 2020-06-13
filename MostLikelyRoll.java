
public class MostLikelyRoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int trial = 25;
		int sum = 0;
		
		for (int i = 0; i < trial; i++)
		{
			int r = (int)((Math.random() * 7) + 1);
			System.out.println(r);
			sum = sum + r;
			
			if (sum > 12)
				break;
		} 
		
		
		System.out.println("sum = " + sum);
		
		
		System.out.println("trials = " + trial);
	}
}
