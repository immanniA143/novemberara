package patterns;

public class Pattern5 {
	public static void main(String[] args) {
		int size=4,px=size+1,py=size+1,l=5;
		for(int i=size;i>=-size;i--) {
			for(int j=1;j<2*size+2;j++) {
				if(j==px||j==py)
					System.out.print(" "+l);
				else
					System.out.print("  ");
			}
			System.out.println();
			if(i>0) {
				px++;
				py--;
				l--;
			}
			if(i<=0) {
				px--;
				py++;
				l++;
			}
		}
	}

}
