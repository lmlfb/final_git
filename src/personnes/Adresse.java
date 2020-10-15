package personnes;

public class Adresse {
	
	public String numero;
	public String voie;
	public String ville;
	public String codePostal;
	public String bp;
	public String lieuDit;
	public String cedex;
	
	public Adresse() {
		
		this.numero=" ";
		this.voie = " ";
		this.ville = " ";
		this.codePostal = " ";
		this.bp = " ";
		this.lieuDit = " ";
		this.cedex = " ";		
	}
	
	public Adresse(String numero, String voie, String ville, String codePostal, String bp, String lieuDit, String cedex) {
		
		this.numero=numero;
		this.voie = voie;
		this.ville = ville;
		this.codePostal = codePostal;
		this.bp = bp;
		this.lieuDit = lieuDit;
		this.cedex = cedex;
	}
	
	public boolean validate(String chaine, Integer taille) {
		if(chaine.length()==taille) {
			return true;
		}
		else {
			return false;
		}
	}

}
