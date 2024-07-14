
public class rel_log {

	public static void main(String[] args) {
		
		//Relational and Logical operators
		
		int a = 20;
		int b = 25;
		int c = 20;
		boolean res = a > b;
		boolean res1 = a >= c;
		boolean res2 = b>a && c<b;
		boolean res3 = a>b || b>c;
		boolean res4 = !res3;
		System.out.println("res:"+res+"\nres1:"+res1+"\nres2:"+res2+"\nres3:"+res3+"\nres4:"+res4);

	}

}
