
public class XuLyBaiTapHai {

	public XuLyBaiTapHai() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int n;
		n= timSoNguyenDuongNhoNhat();
		System.out.println("Số nguyên dương n nhỏ nhất để tổng lớn hơn 10000 là: \t" +n);
	}
	
	public static int timSoNguyenDuongNhoNhat () {
		int n;
		int tong =0;
		n =1;
		while (n <10000) {
			tong += n;
			if (tong > 10000) {
				break;
			}
			n++;
		}
		return n;
	}	

}
