package ex_1_2;

public class PizzaioloPresunto implements IPizzaiolo {
	
	@Override
	public void preparar() {
		IFabricaPizza fabricaP = ProdutorFabricaPizza.getFabrica("PRESUNTO");
		IFabricaCalzone fabricaC = ProdutorFabricaCalzone.getFabrica("PRESUNTO");
		IPizza pizza = fabricaP.getInstance("PRESUNTO");
		ICalzone calzone = fabricaC.getInstance("PRESUNTO");
		pizza.ingredientes();
		calzone.ingredientes();
		
	}

}
