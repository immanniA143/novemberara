package patterns;

public class Pattern16 {
	public static void main(String[] args) {
		int size=7,px=1,py=size;
		for(int i=1;i<=size;i++) {
			for(int j=1;j<=7;j++) {
				if(j==px||j==py||j==1||j==7||i==7||i==1)
					System.out.print("* ");
				else
					System.out.print("   ");
			}
			if(i<=size/2) {
				px++;
				py--;
			}
			else
			{
				px--;
				py++;
			}
			System.out.println();
		}
		
	}
}
