
public class Polygon {

	private Point[] points;

	public Polygon(Point[] points) {
		this.points = points;

	}

	public Polygon() {
		points = null;
	}

	@Override
	public String toString() {
		String s = " ";
		for (Point p : points) {
			s = s + p.toString() + "-";
		}
		s = s + points[0];
		return " ";

	}

	public static double length(Point[] points) {
		int acc = 0;
		for (int i = 0; i < points.length - 1; i++) {
			Segment s = new Segment(points[i], points[i + 1]);
			acc += s.module();
		}
		Segment x = new Segment(points[0], points[points.length - 1]);
		acc += x.module();
		return acc;

	}
	
	public void setOffSet(int offX, int offY) {
		
		for(Point p : points) {
			p.setOffSet(offX, offY);
		}
	}
}
