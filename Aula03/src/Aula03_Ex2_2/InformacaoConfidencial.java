package Aula03_Ex2_2;

public class InformacaoConfidencial implements Informacao {

	@Override
	public void escreverInformacao() {
		System.out.println("Estas informa��es s�o confidenciais, o que significa que provavelmente s� voc� sabe a senha.");

	}

}
