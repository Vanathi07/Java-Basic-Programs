
public class program {
	public static void main(String[] args) {
		        String word = "PROGRAM";
		        int length = word.length();
		        for (int i = 0; i < length; i++) {
		            for (int j = length - i; j > 0; j--) {
		                System.out.print("  ");
		            }

		            for (int k = 0; k <= i; k++) {
		                System.out.print(word.charAt(k) + " ");
		            }
		            System.out.println();
		        }
		    }

	}

