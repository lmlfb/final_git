package personnes;

public class Traitement {

	public static void main(String[] args) {
		
		//----Création des adresses----
		//String numero, String voie, String ville, String codePostal, String bp, String lieuDit, String cedex
		Adresse adresseDupond = new Adresse("5", "Charles Corbeau", "Meadow", "76400", "65, avenue du Marechal Juin", "la Marre", "78052  VERSAILLES CEDEX");
		Adresse adresseThomas = new Adresse("2", "Henri Lon", "Meadow", "78900", "64, avenue du Marechal Laroche", "la Ruel", "74452 LILLES CEDEX");
		Adresse adresseClient1 = new Adresse("4", "Prudence Street", "Carmak", "72400", "57, rue des six frères Ruellan", "Le buisson", "75001 PARIS CEDEX");
		Adresse adresseClient2 = new Adresse("7", "Bassel Street", "Concord", "76560", "23, Place du Jeu de Paume", "le Bel-Air", "75016 PARIS  CEDEX");
		
		//----Création des deposants et architectes----
		//String nom, String prenom, Adresse adresse
		Deposant deposant1 = new Deposant("Bill", "Makin", adresseClient1);
		Deposant deposant2 = new Deposant("Rose", "Betz", adresseClient2);
		Architecte architecte1 = new Architecte("Dupond", "Nicolas", "Seine-Maritime", false, adresseDupond, "09.65.45.96.54");
		architecte1.setInscriptionOrdre(true);
		Architecte architecte2 = new Architecte("John", "Thomas", "Alpes-de-Haute-Provence", false, adresseThomas, "09.65.455.96.54");
		
		//On ajoute des clients à l'architecte 1
		architecte1.addClients(deposant1);
		architecte1.addClients(deposant2);
		
		System.out.print(architecte1.toString()+"\n");
		
		//mauvais format téléphone => pas d'affichage du numéro
		System.out.print(architecte2.toString()+"\n");
		
		deposant1.setCivilite("Homme");
		deposant1.setAdresseMessagerie("bill.making@gmail.com");
		
		deposant2.setCivilite("Femme");
		deposant2.setAdresseMessagerie("rose.betz@outlook.com");

		System.out.print(deposant1.toString()+"\n");
		System.out.print(deposant2.toString()+"\n");
		
		architecte1.printListeClient();
		
		//quelle est l'adresse de l'architecte1 ?
		System.out.print("L'adresse de "+architecte1.getNom()+" est ");
		System.out.print(architecte1.getAdress().getAdress());
		
		

	}

}
