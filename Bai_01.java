import java.lang.System;
import java.util.Scanner;
public class Bai_01 {
	public static void main(String[] args) {
		int a,b;
		int s,h;
		double Tich,Thuong;
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhap a: ");
		a = scanner.nextInt();
		System.out.print("nhap b: ");
		b = scanner.nextInt();
		
		s = a + b ;
		h = a - b  ;
		Thuong = (float)a / b ;
		Tich = a * b ;
		
		System.out.println("Tong = " +s);
		
		System.out.println("Hieu = " +h);
		
		if (b == 0) {
			System.out.println("Thuong ko ton tai");}
			else {
		System.out.println("Thuong = " +Thuong);
		}
		
		System.out.println("Tich = " +Tich);
		  
		if ( a > b ){
			System.out.println(" a lon hon b");
		}
		else if(a < b) {
			System.out.println(" a nho hon b");
		}
		else {
			System.out.println(" a bang b");
		}
		
	}

}
