
public class BreakValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 1;
		int x = 0;
		int [][] a = new int[5][5];
		a[0][0] = 0;
		for (int i = 0; i < 5; i++){
		    for (int j = 0; j < count; j++){
		        a[i][j] = x + 1;
		        x++;
		        System.out.print(a[i][j]);
		    }
		    count++;
		    System.out.println();
		}
	}

}
