package ex_1_2;

public class ProdutorFabricaPizza {

	private ProdutorFabricaPizza() {
	}
	
	public static IFabricaPizza getFabrica(String tipo) {
		switch(tipo) {
		case "CALABRESA":
			return new FabricaPizzaCalabresa();
		case "PRESUNTO":
			return new FabricaPizzaPresunto();
		}
		return null;
	}
	
}
