
class Calculator{
	public int mul(int n1, int n2)
	{
		int res = n1 * n2;
		return res;
	}
}

public class class_obj {

	public static void main(String[] args) {
		
		int num1 = 25;
		int num2 = 40;
		Calculator calc = new Calculator();  //obj creation  ; calc - reference var
		int result = calc.mul(num1,num2);
		System.out.println(result);
		

	}

}
