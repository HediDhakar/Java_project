import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        UniteEnseignement ue = new UniteEnseignement("Math",5,2.5);
        Etudiant[] etudiant = new Etudiant[5];
        etudiant[0] = new Etudiant("Hedi", "Dhakar", "12345678", 5);
        etudiant[1] = new Etudiant("Ahmed", "Ahmed","1222333", 5);
        etudiant[2] = new Etudiant("Walid", "WAlid","11112222", 5);   
        
        etudiant[0].ajouterUE(new UniteEnseignement("Math", 5, 2.5));
        etudiant[0].getUes()[0].ajouterMatiere(new Matiere("Algebre", 15, 18, 2));
        etudiant[0].getUes()[0].ajouterMatiere(new Matiere("Proba", 14, 16, 1.5));
        
        etudiant[0].ajouterUE(new UniteEnseignement("Info", 3, 3));
        etudiant[0].getUes()[0].ajouterMatiere(new Matiere("Java", 10, 16, 2));
        etudiant[0].getUes()[0].ajouterMatiere(new Matiere("Reseau", 11, 9, 1.5));
        
        

        etudiant[1].ajouterUE(new UniteEnseignement("Info", 3, 2.5));
        etudiant[1].getUes()[0].ajouterMatiere(new Matiere("Java", 12, 14, 2));
        etudiant[1].getUes()[0].ajouterMatiere(new Matiere("Reseau", 10, 12, 1.5));
        
        
     
        int choix;
        do {
            System.out.println("1. Ajouter une matiere");
            System.out.println("2. Afficher les moyenne des matieres");
            System.out.println("3. Calculer la moyen generale de UE");
            System.out.println("4. Afficher les notes dun etudiant");
            System.out.print("Choisir un option: ");
            choix = scanner.nextInt();
            scanner.nextLine();
            
            switch (choix) {
                case 1:
                    ajouterMatiere(scanner, ue);
                    break;
                case 2:
                    afficherMoyennes(ue);
                    break;
                case 3:
                    calculerMoyenneGenerale(ue);
                    break;
                case 4:
                    afficherNotesEtudiant(scanner, etudiant);
                    break;
                default:
                    System.out.println("option invalide");
                    break;
            }
        } while (true);  
    }

    public static void ajouterMatiere(Scanner scanner, UniteEnseignement ue) {
        scanner.nextLine();  
        System.out.print("nom de la matiere : ");
        String nom = scanner.nextLine();
        System.out.print("note Ds: ");
        double ds = scanner.nextDouble();
        System.out.print("note examen: ");
        double examen = scanner.nextDouble();
        System.out.print("coefficient : ");
        double coef = scanner.nextDouble();

        Matiere m = new Matiere(nom, ds, examen, coef);
        ue.ajouterMatiere(m);  
    }

    public static void afficherMoyennes(UniteEnseignement ue) {
        for (int i =0; i< ue.getNbMatieres(); i++) {
            System.out.println(ue.getMatieres()[i].getNom_M() + ": " + ue.getMatieres()[i].calculerMoyenne());
        }
    }

    public static void calculerMoyenneGenerale(UniteEnseignement ue) {
        double somme = 0;
        double sommeCoef =0;
        double moyen_generale;

        for (int i= 0; i< ue.getNbMatieres(); i++) {
            somme += ue.getMatieres()[i].calculerMoyenne() * ue.getMatieres()[i].getCoefficient_M();
            sommeCoef += ue.getMatieres()[i].getCoefficient_M();
        }
        
        if (sommeCoef !=0) {
            moyen_generale = somme / sommeCoef;
        } 
        else {
            moyen_generale= 0;
        }        
        System.out.println("La moyen generale : " + moyen_generale);
    }

    public static void afficherNotesEtudiant(Scanner scanner, Etudiant[] etudiants) {
        System.out.print("Entre la cin de l etudiant : ");
        String Cin_input = scanner.nextLine();

        for (int i = 0; i < etudiants.length; i++) {
            Etudiant etudiant = etudiants[i];
            if (etudiant != null && etudiant.getCin().equals(Cin_input)) {
                System.out.println("Notes pour etudiant " + etudiant.getNom() + " " + etudiant.getPrenom());
                UniteEnseignement[] ues = etudiant.getUes();
                for (int j =0; j< etudiant.getUes().length; j++) {
                    if (ues[j] != null) {
                        System.out.println("UE: " + ues[j].getNom_UE());
                        Matiere[] matieres =ues[j].getMatieres();
                        for (int k =0; k< matieres.length; k++) {
                            if (matieres[k]!= null) {
                                System.out.println("Matiere: " + matieres[k].getNom_M());
                                System.out.println("DS:" + matieres[k].getNoteDS());
                                System.out.println("examen: " + matieres[k].getNoteExamen());
                            }}
                    }
                }
                return; 
            } 
        }

        System.out.println("etudiant nexiste pas");
    }
}
