package patterns;

public class Pattern7 {
	public static void main(String[] args) {
		int n=7,px=1,py=n+1;
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=n+1;j++) {
				if(j>px&&j<py)
					System.out.print("  ");
				else
					System.out.print("*");
			}
			System.out.println();
			if(i<=n/2) {
				px++;
				py--;
			}
			else {
				px--;
				py++;
			}
		}
	}

}
