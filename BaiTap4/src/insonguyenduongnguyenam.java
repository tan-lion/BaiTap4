import java.util.Scanner;

public class insonguyenduongnguyenam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Declare
		int number;

		// Input
		System.out.println("Nhap gia tri so nguyen: ");
		number = sc.nextInt();

		// Output
		if (number >= 0) {
			System.out.println("Day la so nguyen duong.");
		} else {
			System.out.println("Day la so nguyen am");
		}
	}
}
