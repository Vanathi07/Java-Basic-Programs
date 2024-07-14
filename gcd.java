import java.util.*;
public class gcd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int gcd=1;
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		for(int i=1;i<=num1 && i<=num2;i++) {
			if(num1%i==0 && num2%i==0) {
				gcd =i;
			}
		}
		System.out.println("GCD of "+num1+ " and "+num2+" is "+gcd);
		

	}

}
