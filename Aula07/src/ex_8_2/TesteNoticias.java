package ex_8_2;

import ex_8_2.observer.AgregadorMensal;
import ex_8_2.observer.AgregadorTopico;
import ex_8_2.observer.Publicador;
import ex_8_2.subject.FonteNoticias;
import ex_8_2.subject.Noticia;

public class TesteNoticias {
	public static void main(String[] args) {
		FonteNoticias fonte = new FonteNoticias();
		
		Publicador observador1 = new Publicador(fonte, "Folha");	
		observador1.assina();
		
		AgregadorMensal observador2 = new AgregadorMensal(fonte);	
		observador2.assina();
		
		AgregadorTopico observador3 = new AgregadorTopico(fonte, "Previsao do tempo");
		observador3.assina();
		
		for(int i = 0; i <= 10; i++) {
			fonte.setNoticia(new Noticia("noticia numero " + i, 2, 2, "Previsao do tempo"));
		}
		
		fonte.setNoticia(new Noticia("Acabou o mes", 1, 3, "Politica"));
		

		
	}
}
