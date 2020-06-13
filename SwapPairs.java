
public class SwapPairs {
	
	public static void main(String[]args)
	{
		int [] a = {10, 30, 40, 50};
		for (int i = 0; i < a.length - 1; i = i + 2) {
			int t = a[i + 1];
			a [i + 1] = a[i];
			a[i] = t;
			
		}
		
		for (int i = 0; i < a.length - 1; i = i + 2) {
			System.out.print(" " + a[i+1] + " " + a[i]);
		}
		
	}

}
