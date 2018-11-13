

public class MainClassSegment2 {

	public static void main(String[] args) {
		
		Segment segment = new Segment(new Point(4,5), new Point(6,8));
		segment.setOffSet(4, 4);
		System.out.println(segment.toString());
		Point[] ps = {new Point(2,2), new Point(2,4), new Point(4,4), new Point(4, 2)};
		
		System.out.println(calculatePerimeter(ps));
		
		Polygon pol = new Polygon(ps);
		System.out.println(pol);
		pol.setOffSet(4, 8);
		System.out.println(pol);
	}
	
	public static double calculatePerimeter(Point[] points) {
		int acc = 0;
		for(int i = 0; i<points.length-1; i++) {
			Segment s = new Segment(points[i], points[i+1]);
			acc += s.module();
		}
		Segment x = new Segment(points[0], points[points.length - 1]);
		acc += x.module();
		return acc;
		
	}

}
