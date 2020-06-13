
public class SumOfReciprocal {
	
	//public static double sumTo(int n) {
		//if (n == 0) return 0.0;
		//if (n == 1) return 1.0;
		//return 1.0/n + sumTo(n-1);
		
	//}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3;
		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum = sum + 1.0/(n-i);
		}
		System.out.println(sum);
	}

}
