package ex_1_2;

public class FabricaPizzaioloCalabresa implements IFabricaPizzaiolo {

	@Override
	public IPizzaiolo getInstance() {		
		return new PizzaioloCalabresa();
	}

}
