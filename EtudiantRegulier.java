
public class EtudiantRegulier extends Direction{
	protected String nomSection;
	
	public EtudiantRegulier(String n, int a, String section) {
		super(n, a);
		nomSection = section;
	}
	
	@Override
	public String toString() {
		return " L’étudiant régulier " + nom + ", inscrit en section de " + nomSection + " en " + anneeArriveeIUT+ ".";
	}
}
