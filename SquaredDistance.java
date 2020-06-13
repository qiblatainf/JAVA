
public class SquaredDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 4;//Integer.parseInt(args[0]);
		
		
		int Xmax = 5 ;//Integer.parseInt(args[1]);
		int Xmin = -5 ;//Integer.parseInt(args[2]);
		int Ymax = 5 ;//Integer.parseInt(args[1]);
		int Ymin = -5 ;//Integer.parseInt(args[2]);
		int x = 0;
		int y = 0;
		System.out.println("(" + x + ", " + y + ")");
		
		for (int i = 1; i < n; i++)
		{
			
			int a = Xmin + (int)(Math.random() *(Xmax - Xmin));
			x = a;
			int b = Ymin + (int)(Math.random() *(Ymax - Ymin ));
			y = b;
			System.out.println("(" + x + ", " + y + ")");
		}
		
		int squared_distance = (x*x) + (y*y);
		System.out.println("Squared Distance: " + squared_distance);
	}

}
