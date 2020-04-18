package ex_8_2.observer;

import ex_8_2.subject.Noticia;

public abstract class Agregadores extends Noticiario{
	
	public abstract void concatena(Noticia noticia);
	
}
