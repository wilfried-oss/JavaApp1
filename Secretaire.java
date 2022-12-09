
public class Secretaire extends Direction {
	
	private String nomSecteurActivite;
	
	public Secretaire(String n, int a, String activite) {
		super(n, a);
		nomSecteurActivite = activite;
	}

	@Override
	public String toString() {
		return "La sécretaire " + nom + ", engagée auprès du Directeur Adjoint en " + anneeArriveeIUT + ". Son secteur d'activité est " + nomSecteurActivite + ".";
	}
	
	
	

}
