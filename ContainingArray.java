
public class ContainingArray {
	
	public static boolean containsarray(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b[0]) {
			for(int j = 1; j < b.length-1; j++) {
				if (a[i+j] == b[j]) return true;
			}
			if (true) break;
			}
		}
		return false;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] list1 = {1, 6, 1, 2, 1, 1, 8};
		int [] list2 = {1, 2, 1};
		System.out.println(containsarray(list1, list2));
	}

}
