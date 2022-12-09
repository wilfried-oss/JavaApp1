
public abstract class Direction {
	
	protected String nom;
	protected int anneeArriveeIUT;
	
	
	
	public abstract String toString();



	/**
	 * @param nom
	 * @param anneeArriveeIUT
	 */
	public Direction(String nom, int anneeArriveeIUT) {
		this.nom = nom;
		this.anneeArriveeIUT = anneeArriveeIUT;
	}
	
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAnneeArriveeIUT() {
		return anneeArriveeIUT;
	}
	public void setAnneeArriveeIUT(int anneeArriveeIUT) {
		this.anneeArriveeIUT = anneeArriveeIUT;
	}
	
}
