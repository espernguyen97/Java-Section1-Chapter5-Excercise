import java.util.Scanner;

public class XuLyBaiTapMot {

	public XuLyBaiTapMot() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		nhapLuaChon();
		choiVoiMay(scan);

	}

	public static void nhapLuaChon() {
		System.out.println("Trò chơi Kéo Búa Bao");
		System.out.println("Vui lòng chọn");
		System.out.println("Chọn 1 để ra Kéo");
		System.out.println("Chọn 2 để ra Búa");
		System.out.println("Chọn 3 để ra Bao");
		System.out.println("Chọn 0 để Thoát khỏi trò chơi");
	}

	public static void choiVoiMay(Scanner scan) {
		boolean thoat = true;
		int diemNguoiChoi = 0;
		int diemMay = 0;
		do {
			System.out.println("Mời người chơi chọn >>");
			int nguoiChon = Integer.parseInt(scan.nextLine());
			int mayChon = (int) (Math.random() * 3 + 1);
			switch (nguoiChon) {
			case 1:
				if (mayChon == 1) {
					System.out.println("Hòa");
				} else if (mayChon == 2) {
					System.out.println("Hòa");
				} else {
					diemNguoiChoi++;
					System.out.println("Người chơi thắng");
				}

				break;
			case 2:
				if (mayChon == 2) {
					System.out.println("Hòa");
				} else if (mayChon == 2) {
					System.out.println("Hòa");
				} else {
					diemMay++;
					System.out.println("Máy thắng");
				}

				break;
			case 3:
				if (mayChon == 3) {
					diemNguoiChoi++;
					System.out.println("Máy thắng");
				} else if (mayChon == 2) {
					diemMay++;
					System.out.println("Máy thắng");
				} else {
					System.out.println("Người chơi thắng");
					diemNguoiChoi++;
				}
				break;

			case 0:
				thoat = false;
				System.out.println("Bạn đã thoát khỏi trò chơi");
				break;

			default:
				System.out.println("Vui lòng nhập 1,2,3 để ra kéo, búa, bao hoặc 0 để thoát khỏi trò chơi");
			}

		} while (thoat);

		if (diemNguoiChoi > diemMay) {
			System.out.println("Tỷ số trò chơi là \t" + diemNguoiChoi + "\t:\t" + diemMay);
			System.out.println("Người chơi thắng");
		} else if (diemNguoiChoi < diemMay) {
			System.out.println("Tỷ số trò chơi là \t" + diemNguoiChoi + "\t:\t" + diemMay);
			System.out.println("Máy thắng");
		} else {
			System.out.println("Chơi lại");
		}

	}

}
