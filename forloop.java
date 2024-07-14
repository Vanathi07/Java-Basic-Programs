
public class forloop {

	public static void main(String[] args) {
		for(int i=1;i<=7;i++)             //for(int i=4;i>=1;i--)
		{
			System.out.println("DAY "+i);
			for(int j=1;j<=16;j+=2)
			{
				System.out.println("     "+(j+8)+ " - "+(j+10));
			}
		}
		
		int k=1;
		for(;k<7;)
		{
			System.out.println("\nBye");
			k++;
		}
		System.out.println("\n\t\tThankyou!!!");
	}

}
