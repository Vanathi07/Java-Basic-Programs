import java.util.*;
public class alt_tab {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp;
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
			int k= sc.nextInt();		 
	        if (k < n)
	        {
	             temp = arr[k - 1];
	             for (int i = k - 1; i > 0; i--) 
	             {
	                 arr[i] = arr[i - 1];
	             }
	            arr[0] = temp;
	        }
	        	
	        for (int i = 0; i < n; i++) 
	        {
	        		System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }


}
