import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x1 = 0;
		double y1 = 0;
		double x2 = 0;
		double y2 = 0;
		System.out.println("Задайте координату x первой точки");
		if (scan.hasNextDouble()) {
			x1 = scan.nextDouble();
		}else {
			System.out.println("Вы ввели не числовое значение. Пример:(128,33). Пожалуйста, перезапустите программу и используйте только числовые значения");
			return;
		}
		System.out.println("Задайте координату y первой точки");
		if (scan.hasNextDouble()) {
			y1 = scan.nextDouble();
		}else {
			System.out.println("Вы ввели не числовое значение. Пример:(128,33). Пожалуйста, перезапустите программу и используйте только числовые значения");
			return;
		}
		System.out.println("Задайте координату x второй точки");
		if (scan.hasNextDouble()) {
			x2 = scan.nextDouble();
		}else {
			System.out.println("Вы ввели не числовое значение. Пример:(128,33). Пожалуйста, перезапустите программу и используйте только числовые значения");
			return;
		}
		System.out.println("Задайте координату y второй точки");
		if (scan.hasNextDouble()) {
			y2 = scan.nextDouble();
		}else {
			System.out.println("Вы ввели не числовое значение. Пример:(128,33). Пожалуйста, перезапустите программу и используйте только числовые значения");
			return;
		}
		Point point1 = new Point(x1,y1);
		Point point2 = new Point(x2,y2);
		
		double otvet = Point.distance(point1, point2);
		System.out.println("Расстояние между точками в данной плоскости = "+otvet);
	}
}
