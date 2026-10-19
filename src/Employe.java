public abstract class Employe {
    protected String matricule;
    protected String nom;
    protected double tarifJournalier;

    // Association réflexive : 0..1 supérieur
    private Employe superieur;

    public Employe(String matricule, String nom, double tarifJournalier) {
        this.matricule = matricule;
        this.nom = nom;
        this.tarifJournalier = tarifJournalier;
        this.superieur = null;
    }

    public String getMatricule() {
        return matricule;
    }

    public abstract double calculerCout(int nbJours);

    public void afficherDetails() {
        System.out.println("Matricule : " + matricule
                + " | Nom : " + nom
                + " | Tarif journalier : " + tarifJournalier + " DH"
                + " | Supérieur : " + (superieur != null ? superieur.nom : "aucun"));
    }

    public void setSuperieur(Employe superieur) {
        if (superieur == this) {
            throw new IllegalArgumentException("Un employé ne peut pas être son propre supérieur.");
        }
        this.superieur = superieur; // null autorisé : pas de supérieur
    }

    public Employe getSuperieur() {
        return superieur;
    }
}
