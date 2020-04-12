package EX6_2;

public class Bubble_Sort implements Strategy {
	public static int[] bolha(int v[]) {
		for (int i = v.length - 1; i > 0; i--) {
			for (int j = 0; j <= i - 1; j++) {
				if (v[j] > v[j + 1]) {
					int aux = v[j + 1];
					v[j + 1] = v[j];
					v[j] = aux;
				}
			}
		}
		return v;
	}

	@Override
	public void ordenar(int[] vetor) {
		// TODO Auto-generated method stub

	}
}

