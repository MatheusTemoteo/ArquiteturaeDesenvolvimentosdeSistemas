package ex_1_2;

public class FabricaPizzaioloPresunto implements IFabricaPizzaiolo {

	@Override
	public IPizzaiolo getInstance() {
		return new PizzaioloPresunto();
	}

}
