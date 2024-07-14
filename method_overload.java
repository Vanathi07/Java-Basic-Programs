
class Calculator1{
	
	public int add(int n1,int n2,int n3) {
		return n1+n2+n3;
	}
	
	public int add(int n1,int n2) {
		return n1+n2;
	}
	
	public double add(int n1, double n2) {
		return n1+n2;
	}
}

public class method_overload {

	public static void main(String[] args) {
		
		Calculator1 calc = new Calculator1();
		int res1 = calc.add(5,6,7);
		int res2 = calc.add(4,3);
		double res3 = calc.add(8,9.2);
		System.out.println("Result 1 : "+res1+"Result 2 : "+res2+"Result 3 : "+res3);

	}

}
