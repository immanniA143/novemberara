package patterns;

public class Pattern2 {
	public static void main(String[] args) {
		int size=3;
		for(int i=size;i>=-size;i--) {
			for(int k=0;k<Math.abs(i);k++) {
				System.out.print("   ");
			}
			for(int j=size;j>=Math.abs(i);j--) {
				System.out.print(" "+(char)(65+j));
			}
			System.out.println();
		}
	}

}
