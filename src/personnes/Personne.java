package personnes;

public class Personne {

    private String nom;
    private String prenom;
    
    public Personne(String nom, String prenom) {
        this.nom = validate(nom, 50);
        this.prenom = validate(prenom, 30);
    }
    
    private String validate(String chaine, Integer taille) {

        // Vérifie la taille et renvoie une chaîne tronquée
        // si la taille est supérieure à taille

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