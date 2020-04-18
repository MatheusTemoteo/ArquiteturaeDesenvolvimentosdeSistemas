package ex_8_2.observer;

import java.util.ArrayList;

import ex_8_2.subject.FonteNoticias;
import ex_8_2.subject.Noticia;

public class AgregadorMensal extends Agregadores{

	private ArrayList<Noticia> noticias = new ArrayList<Noticia>();
	private int mes;	
	
	public AgregadorMensal(FonteNoticias fonte) {
		setFonte(fonte);
		setNome("Agregador Mensal");
	}

	@Override
	public void concatena(Noticia noticia) {
		if(mes == 0) {
			this.mes = noticia.getMes();
		}
		if(mes == noticia.getMes()){
			noticias.add(noticia);			
		} else {
			notificaNoticia();
			noticias.clear();
			this.mes = noticia.getMes();
		}
	}


	@Override
	public void consomeNoticia(String textoNoticia, int dia, int mes, String topico) {
		Noticia noticia = new Noticia(textoNoticia, dia, mes, topico);
		concatena(noticia);
	}

	@Override
	protected void notificaNoticia() {
		System.out.println("-----------------------------------------");
		System.out.println("Agregador mensal: ");
		System.out.println("Topico: Mensal");
		for(Noticia noticiaMes: noticias) {
			System.out.printf("Noticia: %s\n", noticiaMes.getTexto());
		}
		System.out.println("-----------------------------------------");
		
	}

}
