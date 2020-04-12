package EX7_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public abstract class Abstract {
	public final void transformarString() throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Digite");
		String string = reader.readLine();

		System.out.println("Transformado: " + transformarString(string));
		System.out.println();
	}
	protected abstract String transformarString(String string);
}
