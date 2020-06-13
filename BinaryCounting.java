
public class BinaryCounting {
	

	public static void countBinary(int n, String num) {
	    if(n == 0) {
	        System.out.println(num);
	        return;
	    }
	    
	    countBinary(n - 1, num + "0");
	    countBinary(n - 1, num + "1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 2;
		String num = "";
	    countBinary(n, num);

		
	}

}
