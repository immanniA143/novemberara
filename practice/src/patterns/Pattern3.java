package patterns;
public class Pattern3 {
	public static void main(String[] args) {
		int size=5;
		for(int i=size;i>=1;i--) {
			for(int k=size;k>i;k--)
				System.out.print("  ");
			for(int j=i;j>=1;j--)
				System.out.print("  "+(char)(64+j));
			System.out.println();
		}
	}
}
