
import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		System.out.print("Enter the value: ");
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
	
			if (x < min)
				min = x;
			else if (x > max)
				max = x;
			
			
			
		}
			
		System.out.println("MAXIMUM IS: " + max);
		System.out.println("MINIMUM IS: " + min);
		
	}

}
