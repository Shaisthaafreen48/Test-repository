/*
1    2    3    4    5    
6    7    8    9        
10    11    12            
13    14                
15                    
 */
package javaSample;

public class Pattern19 {
	public static void main(String[] args) 
	{
		{
			int n=5,k=01;
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < n; j++) 
				{
					if(i+j<=n-1)
		
						System.out.print(k+++"    ");
					else
						System.out.print("    ");
				}
				System.out.println();
				
			}
		
		}
	}



}
