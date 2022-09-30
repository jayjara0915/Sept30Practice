public class Sept30 {
	public static void main(String[] args) {
		int mthree = 0;
		int mfive = 0;
		int sum = 0;
		final int THOUSAND = 1000;
		
		System.out.println("Multiples of 3:");
		int mthreestore = 0;
		for (int i = 3; i <= THOUSAND; i += 3) {
			if (i % 3 == 0) {
				mthree += 3;
			}
			mthreestore += mthree;
			System.out.println(mthree);
		}
		System.out.println("Multiples of 5:");
		int mfivestore = 0;
		for (int j = 5; j <= THOUSAND; j += 5) {
			if (j % 5 == 0) {
				mfive += 5;
			}
			mfivestore += mfive;
			System.out.println(mfive);	
		}
		sum = mthreestore + mfivestore;
		System.out.println("\nSum of multiples of 3 and 5:\n" + sum);
		
	}
}
