package patterns;

public class Pattern11 {
	public static void main(String[] args) {
		int size=5,px=1,py=size;
		for(int i=1;i<=size;i++)
		{
			for(int j=1;j<=size;j++)
			{
				if(i==size/2+1||j==size/2+1)
					System.out.print("x ");
				else
					System.out.print("o ");
			}
			System.out.println();
			if(i<=size/2)
			{
				px++;
				py--;
			}
			else
			{
				px--;
				py++;
			}
		}
	}

}
