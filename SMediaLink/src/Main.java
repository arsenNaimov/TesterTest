import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x1 = 0;
		double y1 = 0;
		double x2 = 0;
		double y2 = 0;
		System.out.println("������� ���������� x ������ �����");
		if (scan.hasNextDouble()) {
			x1 = scan.nextDouble();
		}else {
			System.out.println("�� ����� �� �������� ��������. ������:(128,33). ����������, ������������� ��������� � ����������� ������ �������� ��������");
			return;
		}
		System.out.println("������� ���������� y ������ �����");
		if (scan.hasNextDouble()) {
			y1 = scan.nextDouble();
		}else {
			System.out.println("�� ����� �� �������� ��������. ������:(128,33). ����������, ������������� ��������� � ����������� ������ �������� ��������");
			return;
		}
		System.out.println("������� ���������� x ������ �����");
		if (scan.hasNextDouble()) {
			x2 = scan.nextDouble();
		}else {
			System.out.println("�� ����� �� �������� ��������. ������:(128,33). ����������, ������������� ��������� � ����������� ������ �������� ��������");
			return;
		}
		System.out.println("������� ���������� y ������ �����");
		if (scan.hasNextDouble()) {
			y2 = scan.nextDouble();
		}else {
			System.out.println("�� ����� �� �������� ��������. ������:(128,33). ����������, ������������� ��������� � ����������� ������ �������� ��������");
			return;
		}
		Point point1 = new Point(x1,y1);
		Point point2 = new Point(x2,y2);
		
		double otvet = Point.distance(point1, point2);
		System.out.println("���������� ����� ������� � ������ ��������� = "+otvet);
	}
}
