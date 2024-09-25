package NhuY23718321;

import java.util.Calendar;

public class ListGD {

	public static void main(String[] args) {

		Calendar ngayGD = Calendar.getInstance();

	
		GiaoDichDat giaoDichDat = new GiaoDichDat("GD001", ngayGD, 1000000, 500, "A");
		System.out.println(giaoDichDat);
		System.out.println("Thanh Tien Dat: " + giaoDichDat.getThanhTien());


		GiaoDichNha giaoDichNha = new GiaoDichNha("GD002", ngayGD, 2000000, 300, "Cao Cap", "123 Duong ABC");
		System.out.println(giaoDichNha);
		System.out.println("Thanh Tien Nha: " + giaoDichNha.getThanhTien());
	}
}
