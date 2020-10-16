package personnes;

public class Deposant extends Personne{
	
	private String civilite;
	private String adresseMessagerie;
	private Adresse adresse;	

	public Deposant(String nom, String prenom, Adresse adresse) {	
		super(nom, prenom);
		this.adresse = adresse;
	}
	
	public void setAdresseMessagerie(String adresseMessagerie) {
		this.adresseMessagerie = adresseMessagerie;
	}
	
	public String getAdresseMessagerie() {
		return this.adresseMessagerie;
	}
	
	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}
	
	public String getCivilite() {
		return this.civilite;
	}
	
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	public Adresse getAdresse() {
		return this.adresse;
	}
	
	public String toString() {
		
		return super.toString() + " " + this.civilite + " " + this.adresseMessagerie;
	}
	
	public String getIdentite() {
		return this.getNom() + " " + this.getPrenom();
	}
}
