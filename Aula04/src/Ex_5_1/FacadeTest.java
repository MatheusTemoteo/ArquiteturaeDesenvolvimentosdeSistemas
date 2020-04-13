package Ex_5_1;

import java.io.IOException;

public class FacadeTest {
	
	public static void main(String[] args) throws IOException {
		
		IOFacade facade = new IOFacade();
		
		
		facade.lerBinario();
		
		facade.lerText();
		
		facade.lerObj();
	}

}
