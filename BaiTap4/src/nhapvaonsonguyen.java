import java.util.Scanner;

public class nhapvaonsonguyen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Declare
		int n, sum = 0;

		System.out.println("Nhap so phan tu mang: ");
		n = sc.nextInt();
		int[] arr = new int[n];
		
		//Input
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Nhap gia tri phan tu thu: " + i + ": ");
			arr[i] = sc.nextInt();
		}

		for (int i : arr) {
			sum += i;
		}
		System.out.println("Tong gia tri trung binh cua mang: " + sum / n);
	}
}
