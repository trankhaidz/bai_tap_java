import java.lang.System;
import java.util.Scanner;
public class Bai_5 {
	public static void main(String[] args) {
		int n,s = 0;
		Scanner scanner = new Scanner(System.in);
	 do {
		 System.out.println("Nhap Vao So Nguyen :");
		 n = scanner.nextInt();
		 s += n;
		 if (s > 100) 
			 break;
			 
	 }while(n!=0);
			
	 System.out.println("Tong = "+s);
		}
	}
