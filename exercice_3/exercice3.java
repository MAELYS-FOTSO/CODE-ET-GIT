public class StockManager {
	 /*
	  * description de la fonction:gestion du stock
	  * @param typeOperation: type de l'operation
	  * @param produit:produit
	  * @param quantite:quantite de produit 
	  * @param stock :quantite en stock
	  */
   public void gererStock(String typeOperation, String produit, int quantite, int stock) {
   	//ajout dans le stock
       if (typeOperation.equals("ajout")) {
           stock += quantite;
           System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
       // Retrait du stock
       } else if (typeOperation.equals("retrait")) {
           if (stock >= quantite) {
               stock -= quantite;
               System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
           } else {
               System.out.println("Stock insuffisant pour le produit : " + produit);
           }
        // Si l'action est inconnu
       } else {
           System.out.println("Opération inconnue.");
       }
   }
}


