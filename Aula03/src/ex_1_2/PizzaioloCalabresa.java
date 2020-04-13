package ex_1_2;

public class PizzaioloCalabresa implements IPizzaiolo {

	@Override
	public void preparar() {
		IFabricaPizza fabricaP = ProdutorFabricaPizza.getFabrica("CALABRESA");
		IFabricaCalzone fabricaC = ProdutorFabricaCalzone.getFabrica("CALABRESA");
		IPizza pizza = fabricaP.getInstance("CALABRESA");
		ICalzone calzone = fabricaC.getInstance("CALABRESA");
		pizza.ingredientes();
		calzone.ingredientes();
		
	}

}
