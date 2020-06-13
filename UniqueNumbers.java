
public class UniqueNumbers {
	
	public static int numUnique(int[] list, int len) {
		
		if (len == 0) return 0;
		if (len == 1) return 1;
		if (list[len-1] == list[len-2]) return numUnique(list, len-1);
		return 1 + numUnique(list, len-1);
		
	}
	
	public static void main(String[] args) {
		int [] list = {5, 7, 7, 8, 8, 8, 22, 22, 67, 67, 67};
		int len = list.length;
		System.out.println(numUnique(list, len));

	}

}
