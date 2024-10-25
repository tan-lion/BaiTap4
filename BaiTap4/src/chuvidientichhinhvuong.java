import java.util.Scanner;

public class chuvidientichhinhvuong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Declare
		int width;
		int perimeter, acreage;
		// Input
		System.out.println("Nhap chieu rong: ");
		width = sc.nextInt();

		// Output
		System.out.println("Chu vi hinh vuong: " + width * 4);
		System.out.println("Dien tich hinh vuong: " + Math.pow(width, 2));

	}
}
