package ex_1_2;

public class FabricaPizzaPresunto implements IFabricaPizza {

	@Override
	public IPizza getInstance(String tipo) {
		switch(tipo) {
		case "PRESUNTO":
			return new PizzaPresunto();
		}
		return null;
	}
}
