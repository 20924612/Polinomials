
public class Rectangle extends Point {

	private int width;
	private int height;

	public Rectangle() {
		super();
		width = 0;
		height = 0;
	}

	public Rectangle(Point p, int newWidth, int newHeight) {
		setX(p.getX());
		setY(p.getY());
		width = newWidth;
		height = newHeight;

	}

	public Rectangle(Point p1, Point p2) {
		setX(p1.getX());
		setY(p1.getY());
		width = p2.getX() - p1.getX();
		height = p2.getY() - p1.getY();
	}
	
	/*public Rectangle(Segment segment){
	 * int x1 = segment.getStartPoint().getX();
	 * int y1 = segment.getStartPoint().getY();
	 * int x2 = segment.getEndPoint().getX();
	 * int y2 = segment.getEndPoint().getY();
	 * 
	 * int xMin = x1;
	 * 
	 * if(x1 < x2){
	 * setX(x1);
	 * }else{
	 * setX(x2);
	 * }
	 * if(y1 < y2){
	 * setY(y1);
	 * }else{
	 * setY(y2);
	 * }
	 * 
	 * width = Math.abs(x1 - x2);
	 * height = Math.abs(y1 - y2);
	 * }
	 */

	public double getArea() {
		int area = 0;
		area = width * height;
		return area;
	}

	public Point getPoint() {
		Point p1 = new Point(getX(), getY());
		return p1;
	}
	
	public Point getBottomLeftPoint() {
		return getPoint();
	}
	
	public Point getBottomRightPoint() {
		Point p1 = new Point(getX(), getY());
		return p1;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Point getTopLeftPoint() {
		Point p = new Point(getX(), getY() + height);
		return p;
	}
	
	public Point getTopRightPoint() {
		Point p = getTopLeftPoint();
		p.setOffSet(width, 0);
		return p;
	}

	@Override
	public String toString() {
		return "(" + getX() + "," + getY() + ")" + "width: " + width + " " + "height: " + height;

	}

}
