package EX6_2;

public class Insertion_Sort implements Strategy {
	public static int[] insercao(int v[]) {
		int i, j, x;
		for (j = 1; j < v.length; ++j) {
			x = v[j];
			for (i = j - 1; i >= 0 && v[i] > x; --i) {
				v[i + 1] = v[i];
			}
			v[i + 1] = x;
		}
		return v;
	}

	@Override
	public void ordenar(int[] vetor) {
		// TODO Auto-generated method stub
		
	}
}
