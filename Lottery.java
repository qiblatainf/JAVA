
public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = Integer.parseInt(args[0]);
		System.out.println("Your input: " + N);
		int r = (int)((Math.random() * 90) + 10);
		System.out.println("Random number generated: " + r);
		
		
		if(N == r)
				System.out.println("10000");
		else if (((N % 10) == (r / 10) ) && ((r % 10) == (N / 10)))
			System.out.println("3000");
		else if (((N % 10) == (r / 10) )||((r % 10) == (N / 10)))
			System.out.println("1000");
		else
			System.out.println("no prize");
		
	}

}
