import java.util.*;
public class even_odd {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter a num");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}

	}

}
