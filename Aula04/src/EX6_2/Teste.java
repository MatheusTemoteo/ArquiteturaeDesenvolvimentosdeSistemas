package EX6_2;

public class Teste {
	public static void main (String[] args) {
		int[] vetor = {1,2,3,4,5};
		Strategy strategy = new Bubble_Sort();
		Cliente cli = new Cliente(strategy);
		cli.organizar(vetor);
		
		strategy = new Insertion_Sort();
		cli = new Cliente (strategy);
		cli.organizar(vetor);
		
		strategy = new Selection_Sort();
		cli = new Cliente (strategy);
		cli.organizar(vetor);
		
		strategy = new QuickSort();
		cli = new Cliente (strategy);
		cli.organizar(vetor);
	}
}
