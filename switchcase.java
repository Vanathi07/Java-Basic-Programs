import java.util.*;
public class switchcase {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value:");
		n = sc.nextInt();
		switch(n) 
		{
		case 1:
			System.out.println("Today");
			break;
		case 2:
			System.out.println("Tomorrow");
			break;
		case 3:
			System.out.println("Yesterday");
			break;
		default:
			System.out.println("Enter valid value !!");
		}

	}
	
}
