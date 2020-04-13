package ex_1_2;

public class FabricaCalzoneCalabresa implements IFabricaCalzone {

	@Override
	public ICalzone getInstance(String tipo) {
		switch (tipo) {
		case "CALABRESA":
			return new CalzoneCalabresa();			
		}
		return null;
	}

}
