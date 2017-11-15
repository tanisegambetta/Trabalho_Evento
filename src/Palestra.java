import java.util.Date;

public class Palestra extends Evento {

	private String titulo;
	private String resumo;
	private Date hora;
	private String sala;
		
	public Palestra() {
	super();
	}
	
	public Palestra(String titulo, String resumo, Date hora, String sala) {
		super();
		this.titulo = titulo;
		this.resumo = resumo;
		this.hora = hora;
		this.sala = sala;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getResumo() {
		return resumo;
	}
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	
	

	public Date getHora() {
		return hora;
	}


	public void setHora(Date hora) {
		this.hora = hora;
	}

	public String getSala() {
		return sala;
	}


	public void setSala(String sala) {
		this.sala = sala;
	}


	@Override
	public String toString() {
		return "Palestra [titulo=" + titulo + ", resumo=" + resumo + ", hora=" + hora + ", sala=" + sala
				+ ", getNomeEvento()=" + getNomeEvento() + ", getDataEvento()=" + getDataEvento()
				+ ", getOrganizador()=" + getOrganizador() + "]";
	}
  
	}
	
	
	

