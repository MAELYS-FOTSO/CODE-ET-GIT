public class Exercice1 {
	/*
	 * 
	 * 
	 * @param typeproduit :type du produit
	 * 
	 * @param quantite :quantite du produit
	 * 
	 * @param prixUnitaire:prix de chaque produit
	 */
	double reduction = 0;

	public double CalculerFacture(String typeProduit, int quantite, double prixUnitaire) {

		switch (typeProduit) {
		case "Alimentaire":
			reduction = 0.05;
			break;
		case "Electronique":
			reduction = 0.1;
			break;
		case "Luxe":
			reduction = 0.15;
		default:
			System.out.println("Statut de commande inconnu.");
			break;
		}
		return reduction;

	}

	private void traiterFacture(String typeProduit, int quantite, double prixUnitaire) {

		double total = quantite * prixUnitaire;

		// reduction selon la catégorie
		if (typeProduit.equals("Alimentaire")) {
			// Réduction de 5%
			total -= total * reduction;
		} else if (typeProduit.equals("Electronique")) {
			// Réduction de 10%
			total -= total * reduction;
		} else if (typeProduit.equals("Luxe")) {
			// Réduction de 15%
			total -= total * reduction;
		}
		// POUR les produits cheres
		if (total > 1000) {
			total -= total * 0.05;
		}

	}
}
