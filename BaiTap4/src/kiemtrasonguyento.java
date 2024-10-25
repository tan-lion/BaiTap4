import java.util.Scanner;

public class kiemtrasonguyento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Declare
		int number, i = 2;

		// Input
		System.out.println("Nhap gia tri so nguyen: ");
		number = sc.nextInt();
		
		if (number < 2) {
			System.out.println("Day khong phai la so nguyen to.");
		} else if (number == 2) {
			System.out.println("Day la so nguyen to.");
		}
		while (number > i) {
			if (number % i == 0) {
				System.out.println("Day khong phai la so nguyen to.");
				break;
			} else {
				i++;
				if (i == number) {
					System.out.println("Day la so nguyen to.");
				}
			}
		}
	}
}