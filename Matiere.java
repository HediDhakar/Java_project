public class Matiere {
    
    private String nom;
    private double noteDS;
    private double noteExamen;
    private double coefficient;

    public Matiere(String nom, double noteDS, double noteExamen, double coefficient) {
        this.nom = nom;
        this.noteDS = noteDS;
        this.noteExamen = noteExamen;
        this.coefficient = coefficient;
    }


    public double calculerMoyenne() {
        return 0.4 * noteDS + 0.6 * noteExamen;
    }


    public String getNom_M() {  
        return nom; }
    public double getNoteDS() { 
        return noteDS; }
    public double getNoteExamen() { 
        return noteExamen; }
    public double getCoefficient_M() { 
        return coefficient; }

   
    public void setNom(String nom) { 
        this.nom = nom; }
    public void setNoteDS(double noteDS) { 
        this.noteDS = noteDS; }
    public void setNoteExamen(double noteExamen) { 
        this.noteExamen = noteExamen; }
    public void setCoefficient(double coefficient) { 
        this.coefficient = coefficient; }

    public void afficher_M() {
        System.out.println("matiere: " + nom + " DS: " + noteDS + " examen: " + noteExamen + " coefficient: " + coefficient);
    }

}
