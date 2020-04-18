package ex_8_2.observer;

import java.util.ArrayList;

import ex_8_2.subject.FonteNoticias;
import ex_8_2.subject.Noticia;

public class AgregadorTopico extends Agregadores{

	private ArrayList<Noticia> noticias = new ArrayList<Noticia>();
	private String topico;	

	public AgregadorTopico(FonteNoticias fonte, String topico) {
		this.topico = topico;
		setFonte(fonte);
		setNome("Agregador Topico");
	}

	@Override
	public void concatena(Noticia noticia) {
		if(noticias.size() != 10){
			noticias.add(noticia);			
		} else {
			notificaNoticia();
			noticias.clear();
		}
	}



	@Override
	public void consomeNoticia(String textoNoticia, int dia, int mes, String topico) {
		if(topico.equals(this.topico)) {
			Noticia noticia = new Noticia(textoNoticia, dia, mes, topico);
			concatena(noticia);
		}
	}
	
	@Override
	public void notificaNoticia() {
		System.out.println("-----------------------------------------");
		System.out.println("Agregador Topico: ");
		System.out.println("Dia da ultima noticia: " + noticias.get(9).getDia());
		System.out.println("Mes da ultima noticia: " + noticias.get(9).getMes());
		System.out.println("Topico: " + topico);
		for(Noticia noticiaTopico: noticias) {
			System.out.printf("Noticia: %s\n", noticiaTopico.getTexto());
		}
		System.out.println("-----------------------------------------");
	}
}
