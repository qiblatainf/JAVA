//QIBLATAIN FATIMA - 18648
//QUESTION 1 

public class Sudokupractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//hardcoded sudoku matrix 
		int[][] sudoku = { 
				{5, 3, 4, 6, 7, 8, 9, 1, 2},
				{6, 7, 2, 1, 9, 5, 3, 4, 8},
				{1, 9, 8, 3, 4, 2, 5, 6, 7}, 
				{8, 5, 9, 7, 6, 1, 4, 2, 3}, 
				{4, 2, 6, 8, 5, 3, 7, 9, 1}, 
				{7, 1, 3, 9, 2, 4, 8, 5, 6}, 
				{9, 6, 1, 5, 3, 7, 2, 8, 4},
				{2, 8, 7, 4, 1, 9, 6, 3, 5},
				{3, 4, 5, 2, 8, 6, 1, 7, 9} };
		
		//boolean for valid or not
		boolean valid = true;
		
		
		//to check the row
		// r is for row and c is for column																																																																				
		for (int r = 0; r < sudoku. length; r++)
		{
			boolean[] check = new boolean[sudoku[r].length];
			for (int c = 0; c < sudoku[r].length; c++) 
			{
				int d = sudoku[r][c] - 1;
				if(check[d]) {
					System.out.println("Number repeated in the row");
					valid = false;
					break;
				}
				check[d] = true;
			}
		}
		
		//to check the column
		for (int c = 0; c < sudoku[0].length; c++)
		{
			boolean [] check = new boolean[sudoku[c].length];
			for (int r = 0; r < sudoku.length; r++)
			{
				int d = sudoku[r][c] - 1;
				if(check[d]) {
					System.out.println("Number repeated in the column");
					valid = false;
					break;
				}
				check[d] = true;
				
			}
			
		}
		
		//to check the box
		for (int r = 0; r < sudoku.length; r = r + 3)
		{
			for (int c = 0; c < sudoku.length; c = c + 3)
			{
				for (int x = 0; x < sudoku.length-1; x++)
				{
					for (int y = x + 1; y < sudoku.length; y++)
					{
						if (sudoku[r + x % 3][c + x/3] == sudoku[r + y % 3][c + y/3]) {
							System.out.println("Number repeated in the box");
							valid = false;
						}
					}
				}
			}
		} 
		
		if (valid == false)
			System.out.println("The sudoku code is invalid!");
		else
			System.out.println("The suduko code is valid!");
		
	}

}
