package BT_Lab3_2;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TamGiac tg = new TamGiac();
		tg.NhapTG();
		//tg.KiemTra();
		System.out.println("<------------------------------------->");
		if(tg.KiemTra() == true) {
		System.out.println("chu vi tam giac = "+tg.ChuViTG());
		System.out.println("dien tich tam giac = "+tg.DienTichTG());
		}
		System.out.println("<------------------------------------->\n");
		
		DuongTron DT = new DuongTron();
		DT.NhapDT();
		DT.InDT();
		System.out.println("\n<------------------------------------->");
		System.out.println("Chu vi duong tron :"+DT.ChuViDT());
		System.out.println("Dien tich duong tron :"+DT.DienTichDT());
		System.out.println("<------------------------------------->");
		scanner.close();
	}
}
