
public class EtudiantEchange extends EtudiantRegulier{
	private String nomUnivOrigine;
	
	public EtudiantEchange(String n, int a, String sec, String univ) {
		super(n, a, sec);
		nomUnivOrigine = univ;
	}
	
	@Override
	public String toString() {
		return " L’étudiant régulier " + nom + ", inscrit en section de " + nomSection + " en " + anneeArriveeIUT + ". Son université d'origine s'appelle " + nomUnivOrigine + ".";
	}
}
