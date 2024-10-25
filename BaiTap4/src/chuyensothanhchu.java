import java.util.Scanner;

public class chuyensothanhchu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Declare
		int number;
		String text="";
		// Input
		System.out.println("Nhap gia tri so nguyen: ");
		number = sc.nextInt();

		switch (number) {
		case 1:
			text = "Một";
			break;
		case 2:
			text = "Hai";
			break;
		case 3:
			text = "Ba";
			break;
		case 4:
			text = "Bốn";
			break;
		case 5:
			text = "Năm";
			break;
		case 6:
			text = "Sáu";
			break;
		case 7:
			text = "Bảy";
			break;
		case 8:
			text = "Tám";
			break;
		case 9:
			text = "Chín";
			break;	
		case 10:
			text = "Mười";
			break;

		default:
			break;
		}
		
		//Output
		System.out.println(text);
	}
}
