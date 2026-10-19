public class Commercial extends Employe {
    private double tauxPrime;

    public Commercial(String matricule, String nom, double tarifJournalier, double tauxPrime) {
        super(matricule, nom, tarifJournalier);
        this.tauxPrime = tauxPrime;
    }

    @Override
    public double calculerCout(int nbJours) {
        double montantBase = tarifJournalier * nbJours;
        return montantBase + montantBase * tauxPrime;
    }

    @Override
    public void afficherDetails() {
        System.out.print("[Commercial, prime " + tauxPrime + "] ");
        super.afficherDetails();
    }
}
