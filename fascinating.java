import java.util.Scanner;

public class fascinating {

    public static void main(String[] args) {
        int n,flag=1;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        String concat= n + "" + (2 * n) + "" + (3 * n);
        for (char digit = '1'; digit <= '9'; digit++) {
            if (concat.indexOf(digit) == -1) {
               flag=0;
            }
        }
       
        if(flag==0) {
        	System.out.println("Not");

        }
        else {
        	System.out.println("yes");
        }
    }
}
