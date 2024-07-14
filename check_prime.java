import java.util.*;
public class check_prime {

	public static void main(String[] args) {
		int num,flag=0;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if(num ==0 || num ==1) {
			System.out.println("Not a prime");
		}
		else
		{
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					flag =1;
				}
			}
			if(flag==1) {
				System.out.println("Prime");
				
			}
			else {
				System.out.println("Not a prime");
			}
		}
		

	}

}
