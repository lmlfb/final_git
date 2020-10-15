package personnes;

public class Deposant extends Personne{
	
	private String civilite;
	public String adresseMessagerie;
	public Adresse adresse;	

	public Deposant(String nom, String prenom, Adresse adresse) {
		
		super(nom, prenom);
		this.adresse = adresse;

	}
	
	public void setAdresseMessagerie(String adresseMessagerie) {
		this.adresseMessagerie = adresseMessagerie;
	}
	
	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}
	
	public String toString() {
		
		super.toString();
		return " " + this.civilite + " " + this.adresseMessagerie + " " + this.adresse;
	}
}
