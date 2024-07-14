import java.util.Scanner;

public class armstrong {


		public static boolean isArmstrong(int n) 
		{
			int temp,sum=0,last=0,digit=0,res=1;
			temp = n;
			while(temp>0) {
				temp = temp/10;
				digit++;
			}
			temp=n;
			while(temp>0) {
				last = temp%10;
				for(int i=1;i<=digit;i++) {
					res*=last;
				}
				sum+=res;
				//sum+=Math.pow(last, digit);
				temp=temp/10;
				res=1;
			}
			if(n==sum) 
				return true;
			else
				return false;
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			if(isArmstrong(n)==true) {
				System.out.println(n+" is Armstrong number");
			}
			else {
				System.out.println(n+" is not an Armstrong number");
			}
		}

	}


