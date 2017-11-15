
public class Palestrante extends Pessoa {

	
	private String curriculo;
	private String fone;

	public Palestrante() {
		super();
	}

	public Palestrante(String curriculo, String fone) {
		super();
		
		this.curriculo = curriculo;
		this.fone = fone;
	}


	public String getCurriculo() {
		return curriculo;
	}

	public void setCurriculo(String curriculo) {
		this.curriculo = curriculo;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public void InscreverPalestrante(){

	}

	@Override
	public String toString() {
		return "Palestrante [curriculo=" + curriculo + ", fone=" + fone + "]";
	}

	

}



