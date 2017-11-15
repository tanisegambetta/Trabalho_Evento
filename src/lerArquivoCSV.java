import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lerArquivoCSV {

	public static void main(String [] args) {
		
		Scanner sc;
		try {
			sc = new Scanner(new File("participantes.csv"));
			sc.useDelimiter(",|\\n");
			                
			while (sc.hasNext()) {
			Participante p = new Participante("Nome: "+sc.next(), "\nEmail: " +sc.next());
			System.out.println(p);
		}
	}
			catch (FileNotFoundException e) {
				System.out.println("Arquivo não encontrado.");
				return;
			}
		sc.close();
	}

}
		