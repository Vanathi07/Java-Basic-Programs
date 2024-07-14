
public class array {

	public static void main(String[] args) {
		
		// 1D
		
		int num1[] = {3,5,6};
		System.out.println(num1[0]);
		
		//Dynamic 
		
		int num[] = new int[3];
		num[0] = 2;
		num[1] = 6;
		num[2] = 10;
		System.out.println(num[1]);
		num[2] = 8;
		System.out.println(num[2]);
		
		System.out.println("1 D Array : ");
		for(int i=0;i<3;i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		
		// 2D
		
		int nums[][]=new int[3][4];
		System.out.println(nums[2][1]);
		for(int i=0;i<3;i++) 
			{
				for(int j=0;j<4;j++)
				{
					nums[i][j] = (int)(Math.random()*10);
				}
				
			}
		System.out.println("2 D Array : ");
		for(int i=0;i<3;i++) 
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
			
		}
			

	}

}
