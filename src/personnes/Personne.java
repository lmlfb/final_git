package personnes;

public class Personne {

    private String nom;
    private String prenom;
    
    public Personne(String nom, String prenom) {
        this.nom = validate(nom, 50);
        this.prenom = validate(prenom, 30);
    }
    
    private String validate(String chaine, Integer taille) {

        // V�rifie la taille et renvoie une cha�ne tronqu�e
        // si la taille est sup�rieure � taille

        if (chaine.length() <= taille) {
            return chaine;
        } else {
            chaine = chaine.substring(0, taille);
            return chaine;
        }

    }
    
    public String toString() {
        return this.nom + " " + this.prenom;
    }

}