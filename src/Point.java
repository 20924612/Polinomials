
public class Point {

	private int x;
	private int y;

	public Point() {
		x = 0;
		y = 0;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "(" + x + ". " + y + ")";
	}

	public void moveTo(int newx, int newy) {
		x = newx;
		y = newy;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void setOffSet(int offX, int offY) {
		x += offX;
		y += offY;
	}
	
	public static double distance(Point p1, Point p2) {
		Segment segment = new Segment(p1, p2);
		return segment.module();
	}

}
