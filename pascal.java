import java.util.*;
public class pascal {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int[][] triangle = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    triangle[i][j] = 1;
                } else {
                    triangle[i][j] = triangle[i-1][j] + triangle[i-1][j-1]; 
                }
            }
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter row:");
        int row = sc.nextInt();
        for(int j=0;j<=row;j++) {
        	System.out.print(triangle[row][j]+" ");
        }
    }
}

