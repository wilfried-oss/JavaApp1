
public class Segment implements Formes {
	private Point point1;
	private Point point2;
	
	public Segment(Point p1, Point p2) {
		point1 = p1;
		point2 = p2;
	}


	public void setPoint1(Point point1) {
		this.point1 = point1;
	}

	public void setPoint2(Point point2) {
		this.point2 = point2;
	}
	
	public String toString() {
		return "<< Segment délimité par les points " + point1 + " et " + point2 + " >>";
	}
	
	//la mØthode centre retournera le milieu du segment
	@Override
	public Point centre() {
		Point milieu = new Point(0, 0);
		milieu.setX((point1.getX() + point2.getX()) /2);
		milieu.setY((point1.getY() + point2.getY()) /2);
		return milieu;
	}
	
	
	//  la mØthode longueur calculera la longueur du segment
	
	public double longueur() {
		double result = (point1.getX() - point2.getX()) * (point1.getX() - point2.getX()) + (point1.getY() - point2.getY()) * (point1.getY() - point2.getY());
		return Math.sqrt(result);
	}
	@Override
	public String dessine() {	
		return "<<A la règle " + toString() + ">>";
	}
	
	
	
}
