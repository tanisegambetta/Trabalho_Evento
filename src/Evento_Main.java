import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Evento_Main {

	public static void main(String[] args) throws ParseException {
		Scanner ler= new Scanner (System.in);
		Pessoa palestrante = new Palestrante();
		Pessoa participante = new Participante();
		Evento evento = new Evento();
		Evento palestra = new Palestra();


		System.out.println("Digite o nome do Evento a ser criado: ");
		palestra.setNomeEvento(ler.nextLine());


		System.out.println("Digite a data do Evento: ");
		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
		Date data = formatoData.parse(ler.nextLine());
		palestra.setDataEvento(data);


		System.out.println("Informe o organizador do Evento: ");
		palestra.setOrganizador(ler.nextLine());

		int cont = 0;
		do{
			System.out.println("Informe o título da Palestra do Evento: ");
			((Palestra) palestra).setTitulo(ler.nextLine());
			

			System.out.println("Informe o horário da Palestra: ");
			SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
			Date hora = formatoHora.parse(ler.nextLine());
			((Palestra) palestra).setHora(hora);

			System.out.println("Informe a sala da Palestra: ");
			((Palestra) palestra).setSala(ler.nextLine());

			cont++;
		}while(cont<2);


		try{
			FileOutputStream arq = new FileOutputStream ("Evento.csv");
			ObjectOutputStream obj =new ObjectOutputStream (arq);
			obj.writeObject (palestra);
			obj.flush();

			System.out.println ("Gravado com sucesso!");
		}
		catch(Exception erro)
		{
			System.out.println("Ocorreu um erro durante a gravação do arquivo!");

		}

		try{
			FileInputStream arq = new FileInputStream ("Evento.csv");
			ObjectInputStream obj = new ObjectInputStream (arq);
			Evento ev = (Palestra)obj.readObject();
			System.out.println("Nome: " + ev.getNomeEvento()+"\n" + "Data: "+ ev.getDataEvento()+
					"\n"+"Organizador: "+ev.getOrganizador());
		}
		catch(Exception Erro)
		{
			System.out.println("Arquivo não encontrado");
		}

		
		palestrante.ObterInscricao();
		participante.ObterInscricao();
		

	}

}	