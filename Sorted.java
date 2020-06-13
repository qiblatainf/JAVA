
public class Sorted {
	
	public static boolean isSorted(int [] a, int len) {
		
		if (len <= 1) return true;
		if (a[len - 2] > a[len -1]) return false;
		return isSorted(a, len-1);
		
	}

	public static void main(String[] args) {
		int [] a = {4,9,9,10,12};
		int len = a.length;
		System.out.println(isSorted(a, len));

	}

}
