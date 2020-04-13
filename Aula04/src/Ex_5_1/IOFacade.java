package Ex_5_1;

import java.io.*;
import java.nio.file.*;

public class IOFacade {
	
	public void lerBinario() throws IOException {
		
		Path p = FileSystems.getDefault().getPath("", "C:\\arquivo_binario.png");
		byte [] fileData = Files.readAllBytes(p);
		System.out.println("O arquivo binario foi lido, mas ainda não aberto");
		
	}
	
	public void lerText() {
		
		try {
			File file = new File("C:\\arquivo_txt.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String linha;
			while((linha = br.readLine()) != null) {
				System.out.println(linha);;
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void lerObj() {
		
		//criando obj generico para ser lido
		Arquivo_obj objDeTeste = new Arquivo_obj("Se isso aparecer,o objeto foi lido com sucesso");
		
		try {
			FileOutputStream f = new FileOutputStream(new File("myObjects.txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);

			o.writeObject(objDeTeste);

			o.close();
			f.close();

			FileInputStream fi = new FileInputStream(new File("myObjects.txt"));
			ObjectInputStream oi = new ObjectInputStream(fi);

			//lendo obj
			Arquivo_obj obj1 = (Arquivo_obj) oi.readObject();

			System.out.println("conteudo do obj: " + obj1.toString());

			oi.close();
			fi.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error initializing stream");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
		
}
