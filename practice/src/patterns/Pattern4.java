package patterns;

public class Pattern4 {
	public static void main(String[] args) {
		int size=4,temp=0;
		for(int i=size;i>=-size;i--) {
			temp=(i>=0)?temp+1:temp-1;
			for(int  k=1;k<=Math.abs(i);k++)
				System.out.print("  ");
			for(int j=1;j<=1+size-Math.abs(i);j++) {
				System.out.print("  "+Math.abs(temp));
			}
			System.out.println();
			
		}
	}

}
