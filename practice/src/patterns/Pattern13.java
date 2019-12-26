package patterns;

public class Pattern13 {
	public static void main(String[] args) {
		int size=3,temp=1;
		for(int i=1;i<=size;i++) {
			for(int j=1;j<=2;j++) {
				for(int k=size;k>i;k--)
					System.out.print("   ");
				for(int k=1;k<=temp;k++)
					System.out.print(" *");
								System.out.println();
			}
			temp+=2;
		}
	}

}
