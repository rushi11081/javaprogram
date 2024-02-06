package Program;

public class First 
{

	public static void main(String[] args)
	{
		
		int[] arr= {3, 1, 5, 7, 5, 9};
		
		int sum=10;
		
	
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
				
			{
				if(arr[i] + arr[j] == sum)
				{
					System.out.println(arr[i] + " pair " +arr[j]);
				}
					
				}
			}
		}
		

		

}
