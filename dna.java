public class dna {


	public static void main(String[] args) {
		String DNA = "ATAGATGCATAGCGCATAGCTAGATGTGCTGAC";
		String gene = "";
		int t = 0;
		int s = 0;
		String x = "";
		String y = "";

		for (int i = 0; i < DNA.length()-3; i++) {
			x = DNA.substring(i, i + 3); //got it
			if (x.equals("ATG")) { //got it
				s = i;

				for (int j = i; j < DNA.length()-3; j+=3) {
					y = DNA.substring(j, j +3); //got it
					if (y.equals("TAG") || y.equals("TAA") || y.equals("TGA")) { //got it
						t = j + 3; //got it
						gene = DNA.substring(s, t); //got it
						i = j;
						System.out.println(gene);
						break;
					}
	
				}
			}	

		}

			
		}

	
}
