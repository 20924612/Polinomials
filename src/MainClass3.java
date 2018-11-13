
public class MainClass3 {

	public static void main(String[] args) {
		Point p1 = new Point(4, 5);
		Point p2 = new Point(6, 8);
		Segment segment1 = new Segment(p1, p2);
		p1.moveTo(4, 4);
		System.out.println(segment1);

	}

}
