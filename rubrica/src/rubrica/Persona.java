package rubrica;

public class Persona {
	
	private String nome;
	private String indirizzo;
	private long  telefono;
	
	
	public Persona(String nome, String indirizzo, long telefono) {
		super();
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.telefono = telefono;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getIndirizzo() {
		return indirizzo;
	}


	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}


	public long getTelefono() {
		return telefono;
	}


	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	
	
	
}
