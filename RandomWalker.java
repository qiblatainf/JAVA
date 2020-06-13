//QIBLATAIN FATIMA - 18648
//QUESTION 2 - PART A AND PART B

public class RandomWalker {

	public static void main(String[] args) {
		

		//user-input n steps
		int n = Integer.parseInt(args[0]);

		//positions of X and Y
		int current_X = 0;
		int current_Y = 0;
		int X = 0;
		int Y = 0;
		System.out.println("(" + current_X + ", " + current_Y + ")");
		
		//colouring the entire background grey
        StdDraw.setXscale(-20, 20);
        StdDraw.setYscale(-20, 20);
        StdDraw.clear(StdDraw.GRAY);
		
		//determining the next coordinate
		for (int i = 1; i < n; i++) {
			
			//colouring the locations visited white
	        StdDraw.setPenColor(StdDraw.WHITE);
	        StdDraw.filledSquare(current_X, current_Y, 0.5);
	        
			double r = Math.random();
			if (r <= 0.25) {
				//north
				Y++;
				if (Y > current_Y)
					current_Y = Y;
			}
			else if (r <= 0.5 && r > 0.25) {
				//south
				Y--;
				if (Y < current_Y)
					current_Y = Y;
			}
			else if (r <= 0.75 && r > 0.5)
			{
				//east
				X++;
				if (X > current_X)
					current_X = X;
			}
			else if (r < 1.0 && r > 0.75)
			{
				//west
				X--;
				if (X < current_X)
					current_X = X;
			}
			
			System.out.println("(" + current_X + ", " + current_Y + ")");
	
		}
		
		//calculating the squared distance
		int squared_distance = (current_X * current_X) + (current_Y * current_Y);
		System.out.println("squared distance: " + squared_distance);
        
        //colouring the current location blue
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.filledSquare(current_X, current_Y, 0.5);
        
        	
        
	}

}
