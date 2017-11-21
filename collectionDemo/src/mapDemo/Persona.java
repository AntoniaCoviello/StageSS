package mapDemo;

//public class Persona {
public class Persona implements Comparable<Persona>{

	private String nome;
	private String cognome;
	private int eta;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public Persona(){}
	
	public Persona(int eta, String nome, String cognome){
	  setEta(eta);
	  setNome(nome);
	  setCognome(cognome);
	}

	public String toString() {
	  return nome + " " + cognome +" " + eta;
	}

	public boolean equals(Persona p) {
	  if (cognome.equals(p.getCognome()) && nome.equals(p.getNome()) && eta == p.getEta())
	    return true;
	  else
	    return false;
	}

	public int hashCode() {
	  return cognome.length() + nome.length() + eta;
	}

	public int compareTo(Persona p) {
	  if (getEta() == p.getEta())
	    return 0;
	  else if (getEta()>p.getEta())
	    return 1;
	  else
	    return -1;
	}
}
