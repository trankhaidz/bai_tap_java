import java.lang.System;
import java.util.Scanner;
public class Bai_2 {
	public static void main(String[] args) {
		int x;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("nhap so nguyen x : ");
		x = scanner.nextInt();
		
		if( x % 2 == 0) {
			System.out.println(" x la so chan ");
		}
		else {
			System.out.println(" x la so le ");
		}
	}

}
