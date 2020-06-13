//QIBLATAIN FATIMA - 18648
//QUESTION 2 - PART C

public class RandomWalkers {

	public static void main(String[] args) {
		

		//user-input n steps
		int n = Integer.parseInt(args[0]);
		
		//declaring variables
		double squared_distance = 0.0;
		double mean_squared_distance = 0.0;
		
		//user-input trials
		int trials = Integer.parseInt(args[1]);

		//determining the next coordinate
        for (int i = 0; i < trials; i++)
        {
        	//positions of X and Y
    		int current_X = 0;
    		int current_Y = 0;
    		int X = 0;
    		int Y = 0;
        	//steps
        	for (int j = 1; j < n; j++) {
    			
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
 
    		}
        	//calculating the squared distance
        	squared_distance = squared_distance + ((current_X * current_X) + (current_Y * current_Y));
        }
		
		
		//calculating the mean squared distance
		mean_squared_distance = squared_distance/trials;
		System.out.println("mean squared distance: " + mean_squared_distance);

        //Comment on the hypothesis: If we increase the number of trials, the accuracy of mean squared distance increases. 
		//As n increases, the mean squared distance also increases, but not proportionally or with a fixed ratio. 
	}

}
