package personnes;

public class Architecte extends Personne {

  private String conseilRegional;
  private boolean inscriptionOrdre;
  private Adresse adresse;
  String telephone;

  public Architecte(String nom, String prenom, String conseilRegional, boolean inscriptionOrdre, Adresse adresse, String telephone) {
    
	super(nom, prenom);
    this.conseilRegional = conseilRegional;
    this.inscriptionOrdre = inscriptionOrdre;
    this.adresse = adresse;

    if (telephoneValide(telephone)) {
      this.telephone = telephone;
    }
    else {
      this.telephone = "";
    }
    Maj_conseilRegional();
  }
  
  private boolean telephoneValide(String telephone) { //boolean : m
	  //partir sur 0.6.25.41.25 (10 chiffre séparés par un point)
	 
  }
  
  public boolean Maj_conseilRegional() {//renvoie un boolean la mise à jour à été faite = si la variable n'est pas nul
	  
	  if(this.conseilRegional != null) {
		  return true;
	  }
	  else {
		  return false;
	  }
}

  public String toString() {

    // renvoie une chaine contenant le nom, le prenom, le conseil regional et
    // le numero de telephone de l'architecte ainsi que la mention "inscrit"
    // s'il est inscrit au conseil de l'ordre ou "non inscrit" dans le cas contraire
    String chaine = "";
    chaine = chaine + this.conseilRegional + " ";
    return chaine;
  }
}