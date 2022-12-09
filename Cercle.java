
public class Cercle implements Formes {
	private Point centre;
	private double rayon;
	
	
	// Le constructeur
	public Cercle(Point p, double r) {
		centre = p;
		rayon = r;
	}

	@Override
	// Méthode toString() permettant de représenter l'objet
	public String toString() {
		return "<< Cercle de centre " + centre + " et de rayon " + rayon + " >>";
	}

	/*
	 * Les setters et les getters
	 * 
	 * */
	public Point getCentre() {
		return centre;
	}

	public void setCentre(Point centre) {
		this.centre = centre;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	/**
	 * On redéfinit les méthodes de l'Interface Formes
	 * */
	
	
	// Cette première méthode retourne le centre du cercle, qui est un point donc sous le format (x, y)
	@Override
	public Point centre() {
		return this.centre;
	}
	
	// 
	@Override
	public String dessine() {
		return "<< Au compas : " + toString() + " >>";
	}
	
	// la mØthode longueur calculera la circonfØrence du cercle
	public double longueur() {
		return 2*Math.PI*rayon;
	}
}
