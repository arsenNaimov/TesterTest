
public class Point {
	private double coordinates1;
	private double coordinates2;
	public Point(double coordinates1, double coordinates2) {
		this.coordinates1 = coordinates1;
		this.coordinates2 = coordinates2;
	}
	public static double distance(Point p1, Point p2) {
		double x1 = p1.coordinates1;
		double y1 = p1.coordinates2;
		double x2 = p2.coordinates1;
		double y2 = p2.coordinates2;
		double distance = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		return distance;
	}
}
