
public class EVENBEFOREODD {

	public static void evenBeforeOdd(int [] a){
		int n = a.length;

		int k = 0;
		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < a.length; j++) {
				if (a[i] % 2 == 0) {
					a[j] = a[i];
					
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + ", ");
		}
}
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			int [] a = {5, 4, 2, 11, 9, 10, 4, 7, 3};
			evenBeforeOdd(a);
	}
			

}
