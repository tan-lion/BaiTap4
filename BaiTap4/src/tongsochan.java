import java.util.Iterator;
import java.util.Scanner;

public class tongsochan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Declare
		int number, sum = 0, i = 0;

		// Input
		System.out.println("Nhap gia tri mang: ");
		number = sc.nextInt();

		while (i < number) {
			if (i % 2 == 0) {
				sum += i;
			}
			i++;
		}

		// Output
		System.out.println("Tong gia tri chan tu 0-n: " + sum);
	}
}
