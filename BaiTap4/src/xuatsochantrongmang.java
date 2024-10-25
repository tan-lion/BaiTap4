import java.util.Scanner;

public class xuatsochantrongmang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Declare
		int n;

		// Input
		System.out.println("Nhap so phan tu cua mang: ");
		n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Nhap gia tri thu " + i + ": ");
			arr[i] = sc.nextInt();
		}

		System.out.println("Danh sach so chan trong mang: ");
		for (int i : arr) {
			if (i % 2 == 0) {
				System.out.print(i + "\t");
			}
		}
	}
}
