import java.util.Scanner;

public class XuLyBaiTapNam {

	public XuLyBaiTapNam() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Vui lòng nhập vào số n:");
		int n = Integer.parseInt(scan.nextLine());
		System.out.println("Kết quả là:\t" +tinhGiaiThua(n));
	}
	
	public static long tinhGiaiThua (int n) {
		long giaiThua = 1;

		if (n == 1 || n == 0) {
			return giaiThua;
		} else {
			for (int i = 2; i <= n; i++) {
				giaiThua *= i;
			}
		}
		return giaiThua;

	}

}
