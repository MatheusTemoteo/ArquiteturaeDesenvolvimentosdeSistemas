package Ex_5_1;

import java.io.Serializable;

//objeto generico
public class Arquivo_obj implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String conteudo;
	
	public Arquivo_obj(String conteudo) {
		this.conteudo = conteudo;
	}
	
	public void setConteudo() {
		this.conteudo = conteudo;
	}
	
	public String getConteudo() {
		return this.conteudo;
	}
	
	@Override
	public String toString() {
		return conteudo;
	}

}
