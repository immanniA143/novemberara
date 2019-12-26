package patterns;

public class Pattern6 {
	public static void main(String[] args) {
		int size=5,px=1,py=9;
		for(int i=1;i<=size;i++) {
			for(int j=1;j<2*size;j++) {
				if(j>px&&j<py)
					System.out.print("  ");
				else
					System.out.print("*");
			}
			System.out.println();
			px++;
			py--;
		
		}

	}

}
