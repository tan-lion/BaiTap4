import java.util.Scanner;

public class kiemtralechan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Declare
		int number;

		// Input
		do {
			System.out.println("Nhap gia tri so nguyen: ");
			number = sc.nextInt();
		} while (number < 0);
		
		// Output
		if(number%2==0) {
			System.out.println("Số chẵn.");
		}else {
			System.out.println("Số lẽ.");
		}
	}
}
