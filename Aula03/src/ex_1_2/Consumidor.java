package ex_1_2;

import java.util.GregorianCalendar;

public class Consumidor {

	public static void main(String[] args) {
		
		GregorianCalendar calendar = new GregorianCalendar(2020, 02, 18);
		IFabricaPizzaiolo fabrica = Pizzaria.getFabrica(calendar);
		IPizzaiolo pizzaiolo = fabrica.getInstance();
		pizzaiolo.preparar();
	}

}
