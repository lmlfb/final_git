package personnes;

public class Adresse {
	
	private String numero;
	private String voie;
	private String ville;
	private String codePostal;
	private String bp;
	private String lieuDit;
	private String cedex;
	
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
		this.ville = validate(ville, 50);
		this.codePostal = codePostal;
		this.bp = validate(bp, 50);
		this.lieuDit = validate(lieuDit, 50);
		this.cedex = validate(cedex, 50);
	}
	
    private String validate(String chaine, Integer taille) {
    	
        if (chaine.length() <= taille) {
            return chaine;
        } else {
            chaine = chaine.substring(0, taille);
            return chaine;
        }
    }
	
	public String getAdress() {
		
		return "Numero:" +this.numero + " Voie:" + this.voie + " Ville:"+ this.ville + " code postal:" + this.codePostal + " Boîte postal:" + this.bp + " Lieu dit:" + this.lieuDit + " Cedex:" + this.cedex;

	}

}
