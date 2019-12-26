package patterns;

public class Pattern9 {
	public static void main(String[] args) {
		int size=10,te=size-2;
		for(int i=1;i<=size;i++) {
			for(int j=size;j>i;j--)
				System.out.print("  ");
			if(i<=5) {
			for(int k=1;k<=i;k++)
				System.out.print("  *");
			}
			for(int l=size/2;l<i;l++)
				System.out.print("  *");
			for(int z=1;z<=te&&i>size/2;z++)
				System.out.print("  ");
			for(int n=size/2;n<i;n++)
				System.out.print("  *");
			System.out.println();
			te=(i>5)?te-2:te;
		}
	}

}
