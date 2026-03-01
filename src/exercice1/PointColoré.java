package exercice1;

public class PointColoré<T1,T2> extends Point<T1>{
	
	private T2 couleur ; 
	public PointColoré(T1 abs , T1 ords , T2 couleur) {
		super(abs , ords); 
		this.couleur = couleur ; 
	}
	public T2 getCouleur() {
		return couleur;
	}
	public void setCouleur(T2 couleur) {
		this.couleur = couleur;
	}
	
	@Override
	public String toString() {
		return "PointColoré [couleur=" + couleur + ", getCouleur()=" + getCouleur() + ", getAbs()=" + getAbs()
				+ ", getOrd()=" + getOrd() + "]";
	}
	

	
	
}
