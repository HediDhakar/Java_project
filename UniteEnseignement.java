public class UniteEnseignement {
    
    private String nom;
    private Matiere[] matieres;
    private int nbMatieres;
    private double coefficient;

    
    public UniteEnseignement(String nom, int maxMatieres, double coefficient) {
        this.nom = nom;
        this.coefficient = coefficient;
        this.matieres = new Matiere[maxMatieres]; 
        this.nbMatieres = 0;
    }

    public void ajouterMatiere(Matiere m) {
        if (nbMatieres < matieres.length) {
            matieres[nbMatieres] = m;  
            nbMatieres++;              
        } 
        else {
            System.out.println("capacite max");
        }
    }
    

    public void afficherMatieres() {
        System.out.println("Unite: " + nom + " coef: " + coefficient );
        for (int i = 0; i < nbMatieres; i++) {
            matieres[i].afficher_M();
        }
    }

    public double calculerMoyenneUnite() {
        double somme = 0;
        double sommeCoef = 0;
        for (int i = 0; i < nbMatieres; i++) {
            somme += matieres[i].calculerMoyenne() * matieres[i].getCoefficient_M();
            sommeCoef += matieres[i].getCoefficient_M();
        }
        if (sommeCoef != 0) {
            return somme / sommeCoef;
        } else {
            return 0;
        }        
    }

    
    public String getNom_UE() { 
        return nom; }

    public double getCoefficient_UE() { 
        return coefficient; }

    public int getNbMatieres() { 
        return nbMatieres; }

    public Matiere[] getMatieres() { 
        return matieres; }

}
