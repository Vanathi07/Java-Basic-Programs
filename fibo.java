import java.util.*;
public class fibo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a,b=0,c=1;
		for(int i=0;i<num;i++) {
		a=b;
		b=c;
		c=a+b;
		System.out.println(c+" ");
		}
		
	}

}
