package ejemplodearreglosmultiples;

public class multiples {

	public static void main(String[] args) {

		int x[][] = new int[4][4];
		int i;
		int j;

		for (i =0; i < x.length; i++) {
			for (j = 0; j < x[i].length; j++) {
				x[i][j] = i * j;
				System.out.print(x[i][j]);
			}
			
			System.out.println();
		}
	}

}
