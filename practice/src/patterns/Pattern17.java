package patterns;

public class Pattern17 {
	public static void main(String[] args) {
		int size=9,px=size/2,py=size/2;
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(j==px||j==py||j==size/2||i==size/2)
					System.out.print("*  ");
				else
					System.out.print("    ");
			}
			System.out.println();
			px=(i<size/2)?px-1:px+1;
			py=(i<size/2)?py+1:py-1;
		}
	}

}
