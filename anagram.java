import java.util.*;
public class anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		char[] str1 = new char[n1];
		char[] str2 = new char[n2];
		for(int i=0;i<n1;i++) {
		 str1[i] = sc.next().charAt(0);
	}
		for(int i=0;i<n2;i++) {
			 str2[i] = sc.next().charAt(0);
		}
		if(isAnagram(str1,str2,n1,n2)) {
			System.out.println("Anagrams");
		}
		else {
			System.out.println("Not Anagrams");
		}

}
	static boolean isAnagram(char[] str1, char[] str2,int n1,int n2) {
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		if(n1!=n2) {
			return false;
		}
		
		else {
			for(int i=0;i<n1;i++) {
				if(str1[i]!=str2[i]) {
					return false;
				}
			}
			return true;
		}
	}
}
