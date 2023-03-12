import java.lang.System;
import java.util.Scanner;
public class Bai_8 {
	public static void main(String[] args) {
		int n,i;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("nhap so phan tu cua mang :");
			n = scanner.nextInt();
		}while(n<=0);
		int X[] = new int[n];
		for ( i = 0; i < n ; i++) {
			System.out.printf("nhap phan tu thu %d :",i+1);
			X[i] = scanner.nextInt();
		}
		for( i = 0;i<n;i++) {
			System.out.printf("\nX[%d] = %d",+i,+X[i]);
		}
		for( i=0;i<n;i++) {
			sum +=X[i]; 
			//float tbc = sum /X.length;
		}
		float tbc = (float)sum /X.length;
		System.out.println("\ntrung binh cong cua mang la: "+tbc);
	}
}
