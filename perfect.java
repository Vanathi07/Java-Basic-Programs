import java.util.Scanner;

public class perfect {
	
	public static boolean isPerfect(int n) {
		int sum =0,div=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				div=i;
			}
			sum+=div;
			div=0;
		}
		if(sum==n)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			if(isPerfect(n)==true) {
				System.out.println(n+" is Perfect number");
			}
			else {
				System.out.println(n+" is not a Perfect number");
			}
		

	}

}
