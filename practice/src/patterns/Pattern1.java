package patterns;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		int i,j,k,l;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer valve");
		l=sc.nextInt();
		sc.close();
		for(i=l/2+1;i>=1;i--) {
			for(j=0;j<l/2+1-i;j++) {
				System.out.print("   ");
			}
			for(k=1;k<=l;k++) {
				System.out.print(" "+(char)(64+k));
			}
			System.out.println();
			l=l-2;
		}
	}
}
