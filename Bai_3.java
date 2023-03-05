import java.lang.System;
import java.util.Scanner;
public class Bai_3 {
	public static void main(String[] args) {
		String Ten;
		int namSinh;
		int tuoi;
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap ten : ");
		Ten = scanner.nextLine();
		System.out.println("nhap nam sinh : ");
		namSinh = scanner.nextInt();
		
		System.out.println(" Ten : " +Ten);
		System.out.println(" namSinh : " +namSinh);
		
		tuoi = 2023 - namSinh;
		if( tuoi < 16 ) {
			System.out.printf(" Ban %s o do tuoi vi thanh nien " ,Ten);
		}
		else if( tuoi >=16 && tuoi < 18) {
			System.out.printf("Ban %s o do tuoi truong thanh " ,Ten);
		}
		else {
			System.out.printf("Ban %s da gia ",Ten);
		}
	}

}
