package EX4_1;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class HashMapAdapter<M> extends HashMap<M,M>  implements Map<M,M>,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	

	public HashMapAdapter()
	{
		super();
	}

	public HashMapAdapter(int capacidadeInicial) throws IllegalArgumentException
	{
		super(capacidadeInicial);
	}
	public HashMapAdapter(int capacidadeInicial, float load)
			throws IllegalArgumentException
	{
		super(capacidadeInicial, load);
	}
	public HashMapAdapter(M[][] matrix)
			throws IllegalArgumentException, NullPointerException
	{
		super();

		if(matrix == null)
		{
			throw new NullPointerException("Matriz é nula");
		}

		if(matrix.length != 2)
		{
			throw new IllegalArgumentException("Matriz sem as duas linhas");
		}

		if(matrix[0].length != matrix[1].length)
		{
			throw new IllegalArgumentException("Comprimento diferente");
		}

		for(int column = 0; column < matrix[0].length; column++)
		{
			put(matrix[0][column], matrix[1][column]);
		}
	}
	public HashMapAdapter(Map<? extends M, ? extends M> map)
			throws NullPointerException
	{
		super(map);
	}
}