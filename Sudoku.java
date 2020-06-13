//QIBLATAIN FATIMA - 18648
//QUESTION 1 
public class Sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//suduko matrix
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
		int a = 0;
		int b = 0;
		int x = 0;
		int c = 0;
		int r = 0;
		int invalid = 0 ;
		
		while (a < 9 && b < 9 && invalid == 0)
		{
			x = sudoku[a][b];
			for (int i = 0 + r; i < 3 + r; i++)
			{
				for (int j = 0 + c; j < 3 + c; j++)
				{
					if ( i != a || j != b)
					{
						if ( x == sudoku[i][j])
						{
							System.out.println("Number repeated in the box");
							valid = false;
							invalid = 1 ;
							
						}
					}
				}
			}
					b++;
					
					if ( b % 3 == 0 && b != 0)
					{
						b = c;
						a++;
						if ( a % 3 == 0 && a != 0)
						{ 
							c = c + 3;
							b = c ;
							
							a = r ;
							if (c == 9)
							{
								c= 0;
								b = c ;
								r= r + 3 ;
								a = r ;
								if (r == 9)
								{
									a = 100;
									b = 100 ;
								}
							}
						}
					}	
				}
			
		//printing validation
		if (valid == false)
			System.out.println("The sudoku code is invalid!");
		else
			System.out.println("The suduko code is valid!");
		
	}

}
