package leituradepastas;

import java.io.File;

public class LeituraDePastas {

	public static void main(String[] args) {

		File file = new File("C:/Users/Vinicius.Silva/Desktop/de");
		File[] arquivos = file.listFiles();

		for (File fileTmp : arquivos) {

			String nomeDoArquivoComExtensao = fileTmp.getName().toString();
			String enderecoDoXML = fileTmp.toString();
			System.out.println("nome de arquivo: " + nomeDoArquivoComExtensao);
			System.out.println("endereço do arquivo: " + enderecoDoXML);
		}
	}

}
