package personnes;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Architecte extends Personne {

  private String conseilRegional;
  private boolean inscriptionOrdre;
  private Adresse adresse;
  private String telephone;
  private ArrayList<Deposant> listeClients;
  

  public Architecte(String nom, String prenom, String conseilRegional, boolean inscriptionOrdre, Adresse adresse, String telephone) {
    
	super(nom, prenom);
    this.conseilRegional = conseilRegional;
    this.inscriptionOrdre = inscriptionOrdre;
    this.adresse = adresse;
    this.telephone = telephone;

    if (telephoneValide(telephone)) {
      this.telephone = telephone;
    }
    else {
      this.telephone = "";
    }
    Maj_conseilRegional();
    
    listeClients = new ArrayList<Deposant>();
    
  }

  private boolean telephoneValide(String telephone) { //boolean : m
	  //on compare le numero en paramètre au modèle d'un numéro de 10 chiffres séparés par un point
	  if(telephone.length() == 14 && Pattern.matches("[0-9]{2}[.][0-9]{2}[.][0-9]{2}[.][0-9]{2}[.][0-9]{2}", telephone) ) {
		  return true;
	  }
	  else {
		 return false; 
	  }
  }
  
  public boolean Maj_conseilRegional() {//renvoie un boolean la mise à jour à été faite = si la variable n'est pas nul
	  if(this.conseilRegional != null) {
		  return true;
	  }
	  else {
		  return false;
	  }
}

  public String getConseilRegional(){
	  return this.conseilRegional;	  
  }

  public void SetConseilRegional(String conseilRegional) {
	  this.conseilRegional = conseilRegional;
  }
  
  public boolean isInscriptionOrdre() {
	  return this.inscriptionOrdre;
  }
  
  public void setInscriptionOrdre(boolean inscriptionOrdre) {
	  this.inscriptionOrdre = inscriptionOrdre;
  }
  
  public Adresse getAdress() {
	  return this.adresse;
  }
  
  public void setAdresse(Adresse adresse) {
	  this.adresse = adresse;
  }

  public String getTelephone() {
	  return this.telephone;
	  
  }
  
  public void setTelephone(String telephone) {
	  this.telephone = telephone;
  }

  public String toString() {

    // renvoie une chaine contenant le nom, le prenom, le conseil regional et
    // le numero de telephone de l'architecte ainsi que la mention "inscrit"
    // s'il est inscrit au conseil de l'ordre ou "non inscrit" dans le cas contraire

    String chaine = super.toString()+ "";
    chaine += " " + this.conseilRegional + " " + this.telephone + " ";
    if(isInscriptionOrdre()) {
    	chaine+="inscrit";
    }
    else {
    	chaine+="non inscrit";
    }
    return chaine;
  }
  	
  public void listeClients(Deposant deposant) {
	  this.listeClients.add(deposant);
  }
  
  public ArrayList<Deposant> getListeClient() {
	  return listeClients;
  }
  	
}