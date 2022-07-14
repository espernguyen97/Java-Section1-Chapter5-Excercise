import java.util.Scanner;

public class XuLyBaiTapSau {

	public XuLyBaiTapSau() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Vui lòng nhập vào số tiền gửi");
		int tienGui = Integer.parseInt(scan.nextLine());
		System.out.println("Vui lòng nhập vào số tiền muốn có trong tương lai để mua xe");
		int tienMuaXe = Integer.parseInt(scan.nextLine());
		System.out.println("Vui lòng nhập vào số tiền lãi tiết kiệm");
		float tienLaiTietKiem = Integer.parseInt(scan.nextLine());
		int ketQua = tinhSoNamChoDoi(tienGui,tienMuaXe,tienLaiTietKiem);
		System.out.println("Số năm mà anh X phải đợi để mua xe là \t" +ketQua);

	}
	
	public static int tinhSoNamChoDoi (int tienGui, int tienMuaXe,  float tienLaiTietKiem ) {
		int soNamChoDoi =0;
		while (soNamChoDoi < 100) {
			tienGui += (int) (tienGui*((1+tienLaiTietKiem)/100));
			if (tienGui >= tienMuaXe) {
				break;
			}
			soNamChoDoi++;
		}
		return soNamChoDoi;
	} 
	
}
