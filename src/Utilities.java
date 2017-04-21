public class Utilities {

	public static int multiplyer(int m) {

		int total = 0;
		for (int i = 0; i < m; i++) {
			int rng = (int) (Math.random() * m);
			total += rng;
		}

		return total;

	}

}
