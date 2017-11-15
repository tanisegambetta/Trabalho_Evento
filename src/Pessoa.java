import java.io.Serializable;

public class Pessoa implements Serializable{

	private String nome;
	private String email;
	
	
	public Pessoa() {}

	public Pessoa (String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String toString() {
		return nome + "," + email;
	}
	
	public String ObterInscricao(){
		return nome+email;
		
	}
}









