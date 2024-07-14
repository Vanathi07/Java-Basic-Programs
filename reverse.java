import java.util.*;
public class reverse {

	public static void main(String[] args) {
		int num,rev=0;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int num2=num;
		while(num2!=0) 
		{
			int num1=num2%10;
			rev=rev*10+num1;
			num2=num2/10;
		}
		System.out.println(rev);

		if(rev==num) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}
}
