import java.util.*;
public class TestExercice6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Point point1 = new Point(0, 0);
		Point point2 = new Point(0, 4);
		
		System.out.println("Distance entre A et B " + point1.dist(point2) );
		System.out.println("Distance entre B et A " + point2.dist(point1) );
		System.out.print("Donnez le rayon du cercle SVP : ");
		int rayon = sc.nextInt();
		Cercle c1 = new Cercle(point1, rayon);
		System.out.println(c1);
		Segment seg = new Segment(point1, point2);
		
		System.out.println(c1.dessine());
		
		Formes[] tableau = new Formes[3];
		tableau[0] = c1;
		tableau[1] = seg;
		Cercle c2 = new Cercle(point2, rayon);
		tableau[2] = c2;
		System.out.println("AFFICHAGE DU TABLEAU");
		for(int i = 0; i < 3; i++) {
			System.out.println(tableau[i]);
		}
	}
}
