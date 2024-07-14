
public class whileloop {

	public static void main(String[] args) {
		int i = 1;
		while(i<5)
		{
			System.out.println("Hi "+ i);
			int j = 1;
			while(j<7)
			{
				System.out.println("Hello "+j);
				j++;
			}
			System.out.println("Bye j "+j);
			i++;
		}
		
		System.out.println("\nBye i "+i);
		
		int k=9;
		do
		{
			System.out.println("\nGood");
			k++;
		}while(k<=7);
	}

}
