import java.util.Scanner;

public class XuLyBaiTapBon {

	private static float n;


	public XuLyBaiTapBon() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Vui lòng nhập số x:");
		float n = Float.parseFloat(scan.nextLine ());
		System.out.println("Vui lòng nhập mũ n:");
		float x = Float.parseFloat(scan.nextLine ());
		
		float tong = 0;
		
		for (n=1; n < x; n++ ) {
			tong  += (float)Math.pow(x,n) ;
		}
		
		System.out.println("Tổng là :" +tong);

	}
	
	
	
}
