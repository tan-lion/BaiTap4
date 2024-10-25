package part2;

import java.util.Scanner;

public class nhapvaonsonguyenvaluutru {

	// InputArray
	public static void nhapMang(int[] arr, int n) {
		Scanner scanner = new Scanner(System.in);

		// Input
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Nhap gia tri phan tu thu " + i + ": ");
			arr[i] = scanner.nextInt();
		}
	}

	// OutputArray
	public static void xuatMang(int[] arr, int n) {

		// Output
		System.out.println("Cac gia tri trong mang: ");
		for (int i : arr) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Declare
		int n, option;
		System.out.println("Nhap so luong phan tu mang: ");
		n = scanner.nextInt();
		int[] arr = new int[n];

		// Input
		do {
			System.out.println("-----------------------------------------");
			System.out.println("1. Nhap mang. ");
			System.out.println("2. Xuat mang. ");
			System.out.println("3. Tim so lon nhat va vi tri co trong mang. ");
			System.out.println("4. Tim so am dau tien va vi tri cua no trong mang. ");
			System.out.println("5. Tim so am lon nhat va vi tri cua no trong mang. ");
			System.out.println("6. Tinh tong so chan.");
			System.out.println("7. Dem co bao nhieu so am. ");
			System.out.println("8. Tong cac so am. ");
			System.out.println("9. Cho nguoi dung nhap vao x va tim x co trong mang hay khong. ");
			System.out.println("Vui long chon chuc nang(nhap 0 de thoat): ");
			System.out.println("-----------------------------------------");
			option = scanner.nextInt();
			switch (option) {
			case 1:
				nhapMang(arr, n);
				break;

			case 2:
				xuatMang(arr, n);
				break;

			case 3:
				int max = arr[0], pos = 0;

				for (int i = 1; i < arr.length; i++) {
					if (max < arr[i]) {
						max = arr[i];
						pos = i;
					}
				}

				System.out.println("Gia tri lon nhat la " + max + " va nam o vi tri " + (pos + 1));

				break;

			case 4:
				int negativeValue = 0, negativePos = 0;

				for (int i = 0; i < arr.length; i++) {
					if (arr[i] < 0) {
						negativeValue = arr[i];
						negativePos = i;
						break;
					}
				}
				System.out.println("Gia tri am dau tien la " + negativeValue + " va nam o vi tri " + (negativePos + 1));

				break;

			case 5:
				int maxNegativeValue = Integer.MIN_VALUE, maxNegativePos = 0, i = 0;

				while (i < arr.length) {
					if (arr[i] < 0 && arr[i] > maxNegativeValue) {
						maxNegativeValue = arr[i];
						maxNegativePos = i;
					}
					i++;
				}
				System.out.println(
						"Gia tri am lon nhat la " + maxNegativeValue + " va nam o vi tri " + (maxNegativePos + 1));

				break;

			case 6:
				int sumEven = 0;

				for (int j : arr) {
					if (j % 2 == 0) {
						sumEven += j;
					}
				}

				System.out.println("Tong gia tri chan cua mang: " + sumEven);

				break;

			case 7:
				int countNegative = 0;

				for (int j : arr) {
					if (j < 0) {
						countNegative++;
					}
				}

				System.out.println("Tong so am trong mang: " + countNegative);

				break;
			case 8:
				int sumNegative = 0;

				for (int j : arr) {
					if (j < 0) {
						sumNegative += j;
					}
				}

				System.out.println("Tong gia tri am trong mang: " + sumNegative);

				break;
			case 9:
				int valueSearch;
				boolean searchResults = false;

				System.out.println("Nhap gia tri can tim: ");
				valueSearch = scanner.nextInt();

				for (int j : arr) {
					if (valueSearch == j) {
						searchResults = true;
					}
				}
				if (searchResults == true) {
					System.out.println("Gia tri tim kiem ton tai trong mang.");
				} else {
					System.out.println("Gia tri tim kiem khong ton tai trong mang.");
				}

				break;

			default:
				break;
			}
		} while (option != 0);

	}
}