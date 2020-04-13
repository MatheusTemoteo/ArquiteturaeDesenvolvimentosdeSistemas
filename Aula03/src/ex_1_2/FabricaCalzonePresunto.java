package ex_1_2;

public class FabricaCalzonePresunto implements IFabricaCalzone {

	@Override
	public ICalzone getInstance(String tipo) {
		switch (tipo) {
		case "PRESUNTO": 
			return new CalzonePresunto();
		}
		return null;
	}
}
