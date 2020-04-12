package EX7_1;

public class Teste {

	public static void main(String[] args) throws Exception {

		Abstract transformar;
		System.out.println(" ");
		System.out.println("Maiusculo");
		System.out.println(" ");
		transformar = new Maiusculo();
		transformar.transformarString();

		System.out.println(" ");
		System.out.println("Minusculo");
		System.out.println(" ");
		transformar = new Minusculo();
		transformar.transformarString();

		System.out.println(" ");
		System.out.println("Duplique");
		System.out.println(" ");
		transformar = new Duplique();
		transformar.transformarString();

		System.out.println(" ");
		System.out.println("Inverta");
		System.out.println(" ");
		transformar = new Inverta();
		transformar.transformarString();
	}
}