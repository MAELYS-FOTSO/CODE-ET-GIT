public class GestionnaireNotes {
	/*
	 * description de la fonction afficherNotesMoyennes
	 * affiche la note et la moyenne
	 * @param nomEtudiant:nom de l'etudiant
	 * 
	 * @param notes:tableau de notes de l'etudiant
	 */
	public void afficheNotesMoyenne(String nomEtudiant, int[] notes) {
		afficherNotes(nomEtudiant,notes);
		System.out.println("Notes de " + nomEtudiant + ":");
		double moyenne =0;
		afficherMoyenne(nomEtudiant,notes);
		System.out.println("Moyenne : " + moyenne);
	}
	/*
	 * description de la fonction afficherNotes
	 * affiche les notes
	 * @param nomEtudiant:nom de l'etudiant
	 * 
	 * @param notes:tableau de notes de l'etudiant
	 */
	public void afficherNotes(String nomEtudiant, int[] notes) {
			for (int note : notes) {
			System.out.println("- " + note);
		}
	}

	/*
	 * description de la fonction afficherMoyennes
	 * affiche la moyenne
	 * @param nomEtudiant:nom de l'etudiant
	 * 
	 * @param notes:tableau de notes de l'etudiant
	 */
	public void afficherMoyenne(String nomEtudiant, int[] notes) {
		int somme = 0;
		for (int note : notes) {
			somme += note;
		}
		double moyenne = (double) somme / notes.length;
		System.out.println("Moyenne : " + moyenne);
	}
}
