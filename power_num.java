import java.util.*;
public class power_num {

	public static void main(String[] args) {
		int base,exp,res=1;
		Scanner sc = new Scanner(System.in);
		base = sc.nextInt();
		exp = sc.nextInt();
		for(int i=1;i<=exp;i++) {
			res*=base;
		}
		System.out.println(res);

	}

}

