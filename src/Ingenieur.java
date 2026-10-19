public class Ingenieur extends Employe {
    private int niveauExpertise;

    public Ingenieur(String matricule, String nom, double tarifJournalier, int niveauExpertise) {
        super(matricule, nom, tarifJournalier);
        this.niveauExpertise = niveauExpertise;
    }

    @Override
    public double calculerCout(int nbJours) {
        double cout = tarifJournalier * nbJours;
        if (niveauExpertise >= 3) {
            cout += 100 * nbJours;
        }
        return cout;
    }

    @Override
    public void afficherDetails() {
        System.out.print("[Ingénieur, niveau " + niveauExpertise + "] ");
        super.afficherDetails();
    }
}
