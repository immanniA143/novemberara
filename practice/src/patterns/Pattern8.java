package patterns;

public class Pattern8 {
	public static void main(String[] args) {
		int size=3,i,j,k,l,x=2*(size-1),minstars=1;
		for(i=1;i<=size;i++) {
			for(j=size;j>i;j--) {
				System.out.print("  ");
			}
			for(k=1;k<=minstars;k++)
				System.out.print("*");
			for(l=1;l<=x;l++)
				System.out.print("  ");
			for(k=1;k<=minstars;k++)
				System.out.print("*");
			x-=2;
			minstars+=2;
			System.out.println();
		}
	}

}
