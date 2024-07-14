
public class cond_ter {

	public static void main(String[] args) {
		
		//Conditional operator
		
		int a = 18;
		int res;
		if(a%2==0)
			res = 0;
			//System.out.println("Even");
			
		else
			res=1;
			//System.out.println("Odd");
		
		System.out.println("Result by using conditional is:" + res);
		
		//Ternary operator
		
		int result = (a%2==0) ? 0 : 1;
		System.out.println("Result by using ternary is: "+result);

	}

}
