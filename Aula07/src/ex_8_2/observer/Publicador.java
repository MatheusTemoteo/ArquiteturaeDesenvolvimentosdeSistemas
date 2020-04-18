package ex_8_2.observer;

import ex_8_2.subject.FonteNoticias;
import ex_8_2.subject.Noticia;

public class Publicador extends Noticiario {

	private Noticia noticia;
	
	public Publicador(FonteNoticias fonte, String nome) {
		setFonte(fonte);
		setNome(nome);
	}

	
	protected void notificaNoticia() {
		System.out.println("-----------------------------------------");
		System.out.println("Veiculo: "+this.getNome());
		System.out.printf("Topico: %s\nData: %d/%d\n%s\n", noticia.getTopico(), noticia.getDia(), noticia.getMes(), noticia.getTexto());
		System.out.println("-----------------------------------------");
	}

	@Override
	public void consomeNoticia(String textoNoticia, int dia, int mes, String topico) {
		Noticia noticia = new Noticia(textoNoticia, dia, mes, topico);
		this.noticia = noticia;
		this.notificaNoticia();
	}
	
}
