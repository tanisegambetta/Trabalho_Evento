import java.io.Serializable;
import java.util.Date;


public class Evento implements Serializable {

	private String nomeEvento;
	private Date dataEvento;
	private String organizador;


	public Evento() {}
	
	public Evento(String nomeEvento, Date dataEvento, String organizador) {

		this.nomeEvento = nomeEvento;
		this.dataEvento = dataEvento;
		this.organizador = organizador;
	}


	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	public Date getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(Date dataEvento) {
		this.dataEvento = dataEvento;
	}
	public String getOrganizador() {
		return organizador;
	}

	public void setOrganizador(String organizador) {
		this.organizador = organizador;
	}

	@Override
	public String toString() {
		return "Evento [nomeEvento=" + nomeEvento + ", dataEvento=" + dataEvento + ", Organizador=" + organizador + "]";
	}



}


