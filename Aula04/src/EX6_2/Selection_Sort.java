package EX6_2;

public class Selection_Sort implements Strategy {
	public static int[] selecao(int v[]) {
		int i, j, min, x;
		for (i = 0; i < v.length - 1; ++i) {
			min = i;
			for (j = i + 1; j < v.length; ++j) {
				if (v[j] < v[min])
					min = j;
			}
			x = v[i];
			v[i] = v[min];
			v[min] = x;
		}
		return v;
	}

	@Override
	public void ordenar(int[] vetor) {
		// TODO Auto-generated method stub
		
	}
}
