import java.util.Scanner;

public class XuLyBaiTapBa {

	public XuLyBaiTapBa() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = nhapSo(scan);
		tinhTongSoLeNguyenDuong(n);

	}

	public static int nhapSo(Scanner scan) {
		System.out.println("Vui lòng nhập vào số n lớn hơn 0:");
		int n = Integer.parseInt(scan.nextLine());
		return n;

	}

	public static int tinhTongSoLeNguyenDuong(int n) {
		int tong = 0;
		if (n <= 0) {
				System.out.println("Vui lòng nhập lại");
		} else {
			for (int i = 1; i < n; i += 2) {
				tong += i;
			}
		}
		System.out.println("Tổng của các số nguyên dương lẻ nhỏ hơn n là: \t" + tong);
		return tong;
	}
}