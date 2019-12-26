package patterns;

public class Pattern10 {
	public static void main(String[] args) {
		int size=2,px=1,py=2*size+1,l=1;
		for(int i=size;i>=-size;i--){
			for(int j=1;j<=2*size+1;j++) {
				if(j==px||j==py)
					System.out.print(" "+(char)(64+j));
				else
					System.out.print("  ");
			}
			px=(i>0)?px+1:px-1;
			py=(i>0)?py-1:py+1;
			System.out.println();
			l++;
		}
			
	}

}
