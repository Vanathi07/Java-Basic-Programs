import java.util.*;

public class longCommPrefix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of strings:");
        int n = sc.nextInt();
        sc.nextLine(); 
        
        String[] arr = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextLine();
        }
        System.out.println("Input strings:");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.println(arr[i]);
        }
        String lcp = longCommPrefix1(arr);
        System.out.println("Longest Common Prefix: " + lcp);
    }

    static String longCommPrefix1(String[] arr) {
        if (arr == null || arr.length == 0) {
            return "";
        }
        String prefix = arr[0];
        for (int i = 1; i < arr.length; i++) {
            String current = arr[i];
            int j = 0;
            while (j < prefix.length() && j < current.length() && prefix.charAt(j) == current.charAt(j)) {
                j++;
            }
            if (j == 0) {
                return "";
            }
            prefix = prefix.substring(0, j);
        }
        return prefix;
    }
}
