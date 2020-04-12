package EX6_2;

public class Cliente {
	private final Strategy strategy;
	public Cliente (Strategy strategy) {
		this.strategy = strategy;
	}
	public void organizar(int[] vetor) {	
		strategy.ordenar(vetor);
	}
}

