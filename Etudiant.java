public class Etudiant {
    
    private String nom;
    private String prenom;
    private String Cin;
    private UniteEnseignement[] ue;
    private int nbUE;
    private int capacite;

    public Etudiant(String nom, String prenom,String cin ,int capacite) {
        this.nom = nom;
        this.prenom = prenom;
        this.Cin = cin;
        this.capacite = capacite;
        this.ue = new UniteEnseignement[capacite];
        this.nbUE = 0;
    }

    public void ajouterUE(UniteEnseignement ue) {
        if (nbUE < capacite) {
            this.ue[nbUE] = ue;
            nbUE++;
        } else {
            System.out.println("capacite max");
        }
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public UniteEnseignement[] getUes() {
        return ue;
    }

    public String getCin() {
        return Cin;
    }

}
