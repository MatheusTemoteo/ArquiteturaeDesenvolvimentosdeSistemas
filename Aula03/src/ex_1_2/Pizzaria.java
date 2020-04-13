package ex_1_2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Pizzaria {
	
	private Pizzaria() {
	}
	
	public static IFabricaPizzaiolo getFabrica(GregorianCalendar calendar) {
		Date dia = calendar.getTime();
		SimpleDateFormat ft = new SimpleDateFormat("E");
		String string = ft.format(dia);
		String string2 = string.toUpperCase();
		System.out.println(string2);
		
		switch(string2) {
		case "SEG":
			return new FabricaPizzaioloCalabresa();
		case "TER":
			return new FabricaPizzaioloPresunto();
		case "QUA":
			return new FabricaPizzaioloCalabresa();
		case "QUI":
			return new FabricaPizzaioloPresunto();
		case "SEX":
			return new FabricaPizzaioloCalabresa();
		case "SAB":
			return new FabricaPizzaioloPresunto();
		case "DOM":
			System.out.println("A pizzaria não abre aos domingos");
			System.exit(0);
		}
		return null;
	}
}
