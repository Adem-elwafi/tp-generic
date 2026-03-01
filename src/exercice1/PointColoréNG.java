package exercice1;

public class PointColoréNG extends Point<Integer> {
    private String couleur;
    
    public PointColoréNG(Integer abs, Integer ord, String couleur) {
        super(abs, ord);  // Call parent constructor with Integer values
        this.couleur = couleur;
    }
    
    public String getCouleur() {
        return couleur;
    }
    
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    
    @Override
    public String toString() {
        return "PointColoréNG [abs=" + getAbs() + ", ord=" + getOrd() + 
               ", couleur=" + couleur + "]";
    }
}