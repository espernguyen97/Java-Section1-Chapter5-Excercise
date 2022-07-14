import java.util.Scanner;

public class XuLyBaiTapTam {

	public XuLyBaiTapTam() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Vui lòng nhập vào lãi xuất năm r:");
		float laiXuatNam = Float.parseFloat(scan.nextLine());
		System.out.println("Vui lòng nhập vào tiền vốn p:");
		int tienVon = Integer.parseInt(scan.nextLine());
		System.out.println("Vui lòng nhập vào thời hạn gởi tiền n:");
		int thoiHanGoi = Integer.parseInt(scan.nextLine());
		int ketQua = inVonTichLuy (laiXuatNam, tienVon , thoiHanGoi );

	}
	
	public static int inVonTichLuy (float laiXuatNam, int tienVon , int thoiHanGoi ) {
			for (int vonTichLuy = 0;  vonTichLuy < tienVon; vonTichLuy++) {
				vonTichLuy += (int) (tienVon*Math.pow((1+(laiXuatNam*0.01f)),thoiHanGoi));
				if (vonTichLuy > tienVon) {
				System.out.println("Năm \t" +(thoiHanGoi) +"\t Vốn \t" +vonTichLuy);
				}
			}
			return thoiHanGoi; 
	} 
	
}
