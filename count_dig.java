import java.util.*;
public class count_dig {

	public static void main(String[] args) {
		int num,num1,sum = 0;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		while(num>0) {
		num1 = num%10;
		sum+=num1;
		num = num/10;
		}
		System.out.println(sum);

	}

}
