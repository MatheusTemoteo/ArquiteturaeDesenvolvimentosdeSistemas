package ex_1_2;

public class FabricaPizzaCalabresa implements IFabricaPizza {

	@Override
	public IPizza getInstance(String tipo) {
		switch(tipo) {
		case "CALABRESA":
			return new PizzaCalabresa();
		}
		return null;

	}

}
