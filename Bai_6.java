import java.lang.System;
import java.util.Scanner;
public class Bai_6 {
	public static void main(String[] args) {
		int n;
		long giaiThua = 1;
		Scanner scanner = new Scanner(System.in);
		do {
		System.out.println("nhap so n : ");
		n = scanner.nextInt();
		}while(n<0);
		for(int i = 1 ; i <= n ; i++) {
			giaiThua *= i; 
		}
		System.out.printf("Luy Thua cua %d la : %d",n , +giaiThua);
	}
}
