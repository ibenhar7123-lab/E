public class Mission {
    private int nbJours;
    private Employe employe;
    private Projet projet;

    public Mission(Employe employe, Projet projet, int nbJours) {
        this.employe = employe;
        this.projet = projet;
        this.nbJours = nbJours;
    }

    public double calculerMontant() {
        return employe.calculerCout(nbJours); // polymorphisme
    }

    public void afficherRecapitulatif() {
        System.out.println("----- Récapitulatif de la mission -----");
        employe.afficherDetails();
        System.out.println(projet);
        System.out.println("Durée : " + nbJours + " jour(s)");
        System.out.println("Montant : " + calculerMontant() + " DH");
    }
}
