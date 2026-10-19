public class Main {
    public static void main(String[] args) {
        // Employés
        Ingenieur ing1 = new Ingenieur("E01", "Alami", 500, 4);
        Ingenieur ing2 = new Ingenieur("E02", "Bennani", 350, 2);
        Commercial com1 = new Commercial("E03", "Chraibi", 300, 0.10);
        Commercial com2 = new Commercial("E04", "Doukkali", 400, 0.15);

        Employe[] employes = { ing1, ing2, com1, com2 };

        // Projets
        Projet p1 = new Projet("P01", "Site e-commerce");
        Projet p2 = new Projet("P02", "Application mobile");

        // Hiérarchie
        ing2.setSuperieur(ing1);
        com1.setSuperieur(ing1);
        com2.setSuperieur(com1);

        // Affichage des employés
        System.out.println("===== Liste des employés =====");
        for (int i = 0; i < employes.length; i++) {
            employes[i].afficherDetails();
        }

        // Missions
        Mission[] missions = new Mission[4];
        missions[0] = new Mission(ing1, p1, 3);
        missions[1] = new Mission(ing2, p1, 2);
        missions[2] = new Mission(com1, p2, 4);
        missions[3] = new Mission(com2, p2, 2);

        System.out.println("\n===== Missions =====");
        double total = 0;
        for (int i = 0; i < missions.length; i++) {
            missions[i].afficherRecapitulatif();
            total += missions[i].calculerMontant();
        }
        System.out.println("\nMontant total des missions : " + total + " DH");

        // Employés directement supervisés par le premier ingénieur
        int nbSupervises = 0;
        for (int i = 0; i < employes.length; i++) {
            if (employes[i].getSuperieur() == ing1) {
                nbSupervises++;
            }
        }
        System.out.println("Nombre d'employés supervisés par le premier ingénieur : " + nbSupervises);
    }
}
