
public class InterLeave {

	public static int [] interleave(int [] a, int [] b) {
		int x = 0;
		int len = a.length+b.length;
		int [] c = new int[2 * len];
		for (int i = 0; i < len/2+1; i+=2) {
			c[i] = a[x];
			c[i+1] = b[x];
			x++;
		}
		for (int i = (len/2 + 2); i < len; i++) {
			if (b.length > a.length) {
				c[i] = b[x];
				x++;
			}
			else if (a.length > b.length){
				c[i] = a[x];
				x++;
			}
		}
		
		for (int i = 0; i < len; i++) {
			System.out.print(c[i] + " ");
		}
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = {10, 20, 30};
		int [] b = {4, 5, 6, 7, 8};
		System.out.println(interleave(a,b));
	}

}
