import java.util.Random;
import java.util.Scanner;

public class xuatmangsonguyen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		// Declare
		int n;

		// Input
		System.out.println("Nhap so phan tu mang: ");
		n = sc.nextInt();
		int[] arr = new int[n];

		// Hand
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("Nhap gia tri thu " + i + ": ");
//			arr[i] = sc.nextInt();
//		}

		 // Auto
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100);
		}
		
		//Output
		System.out.println("Mang vua nhap: ");
		for (int i : arr) {
			System.out.print(i+"\t");
		}
	}
}
