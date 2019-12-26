package patterns;

public class Pattern15 {
	public static void main(String[] args) {
		int size=7;
		for(int i=1;i<=size;i++) {
			for(int j=1;j<=size;j++) {
				if(j==1||j==i||i==7)
					System.out.print(" *");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}
}
