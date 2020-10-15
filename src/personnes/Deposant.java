package personnes;

public class Deposant extends Personne{
	
	private String civilite;
	public String adresseMessagerie;
	public Adresse adresse;	

	public Deposant(String nom, String prenom, Adresse adresse) {
		super(nom, prenom);
		
		this.civilite=civilite;
		this.adresseMessagerie=adresseMessagerie;
		this.adresse = adresse;	
	}
	
	public String toString() {
		
	}
}
