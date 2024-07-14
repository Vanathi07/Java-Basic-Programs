import java.util.*;
public class power {

	public static void main(String[] args) {
		System.out.println("Enter base:");
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		System.out.println("Enter power:");
		int power = sc.nextInt();
		int res = 1;
		for(int i=0;i<power;i++) {
			res = res * base ;
		}
		int res1 = res%10;
		System.out.println("last digit of given a pow b is: "+res1);
	}
}