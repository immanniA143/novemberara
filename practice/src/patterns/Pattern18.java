package patterns;

public class Pattern18 {
	public static void main(String[] args) {
		int size=9,py=size/2;
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(j==py||i==size/2)
					System.out.print("*  ");
				else
					System.out.print("    ");
			}
			System.out.println();
			py=(i<size/2)?py+1:py-1;
		}
	}
}
