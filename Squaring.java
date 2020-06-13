
public class Squaring {

	public static String writeSquares(int n){
	    if ( n < 1 ) throw new IllegalArgumentException();
	    if ( n == 1 ) return "1";
	    if ( n % 2 != 0) return (n*n) + ", " + writeSquares(n-1);
	    return writeSquares(n-1) + ", " + (n*n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 20;
		System.out.println(writeSquares(n));
	}

}
