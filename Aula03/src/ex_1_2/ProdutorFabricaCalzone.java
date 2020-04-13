package ex_1_2;

public class ProdutorFabricaCalzone {
	
	private ProdutorFabricaCalzone() {
	}
	
	public static IFabricaCalzone getFabrica(String tipo) {
		switch(tipo) {
		case "CALABRESA":
			return new FabricaCalzoneCalabresa();
		case "PRESUNTO":
			return new FabricaCalzonePresunto();
		}		
		return null;
	}
}
