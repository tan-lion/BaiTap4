import java.util.Scanner;

public class minmax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Declare
		int n;
		System.out.println("Nhap so luong phan tu cua mang: ");
		n = sc.nextInt();
		int[] arr = new int[n];
		int min = 0, max = 0;

		// Input
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Nhap gia tri phan tu thu: " + i + ": ");
			arr[i] = sc.nextInt();
		}

		for (int i : arr) {
			if (i > max) {
				max = i;
			}
		}
		for (int j : arr) {
			if (j < min) {
				min = j;
			}
		}

		//Output
		System.out.println("Gia tri lon nhat: " + max);
		System.out.println("Gia tri nho nhat: " + min);
	}
}
