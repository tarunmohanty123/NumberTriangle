
public class NumberTriangle {

	public static void main(String[] args) {
		
		int n=5;
		int space=n-1;
		int chars=1;
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			int x=1;
			for(int k=1;k<=chars;k++)
			{
				System.out.print(x);
				if(k<=chars/2)
					x++;
				else
					x--;
			}
			space--;
			chars=chars+2; 
			System.out.println();
		}
	
	}
	
}
