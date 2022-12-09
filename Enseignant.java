
public class Enseignant extends Direction{
	private String nomMatiere;
	private double salaire;
	
	public Enseignant(String name, int annee, String matiere, double salaire) {
		super(name, annee);
		nomMatiere = matiere;
		this.salaire = salaire;
	}
	
	@Override
	public String toString() {
		return "L’enseignant " + nom + ", engagé  " + anneeArriveeIUT + ". Il a un de " +  salaire + " francs par mois et il enseigne " +  nomMatiere + ".";
	}
}
