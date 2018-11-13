
public class MainClass4 {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle();
		System.out.println(rectangle);
		rectangle.moveTo(4, 7);
		System.out.println(rectangle);
		Rectangle rectangle2 = new Rectangle(new Point(1, 1), 8, 6);
		System.out.println(rectangle2);
		Rectangle rec3 = new Rectangle(new Point(2,2), new Point(5, 8));
		System.out.println(rec3);
		//Rectangle rect3 = new Rectangle(new Segment(new Point(2,8), new Point()))
		Rectangle rec4 = new Rectangle(new Point(4,5), new Point(6, 9));
		System.out.println(rec4);
		System.out.println(rec4.getPoint());
		Point p1 = rectangle2.getPoint();
		System.out.println(p1);
		Rectangle rec5 = new Rectangle(new Point(5,6), 10, 0);
		System.out.println(rec5);
		//System.out.println("Top left: " + rec5.getTopLeftPoint() + " Top right " + rec5.getTopRightPoint() + " Bottom left " + );
	}
	


}
