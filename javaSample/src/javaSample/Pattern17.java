/*
1
23
456
7890
12345
 */
package javaSample;
public class Pattern17 {
	public static void main(String[] args) 
	{
		int n=5,k=1;
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++) 
			{
				if(i>=j)
					System.out.print(k++%10);		
				
			}
			System.out.println();

			
		}
			
	}


}
