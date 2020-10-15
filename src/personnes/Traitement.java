package personnes;

public class Traitement {

	public static void main(String[] args) {
		
		//String numero, String voie, String ville, String codePostal, String bp, String lieuDit, String cedex
		Adresse adresseDupond = new Adresse("5", "75, rue Charles Corbeau", "Lelon", "76400", "65, avenue du Marechal Juin", "le Bosquet", "78012  VERSAILLES  CEDEX");
		
		//String nom, String prenom, String conseilRegional, boolean inscriptionOrdre, Adresse adresse, String telephone
		Architecte architecte1 = new Architecte("Dupond", "Nicolas", "Seine-Maritime", true, adresseDupond, "09.65.45.96.54");
		
		System.out.print(architecte1.toString());

	}

}
