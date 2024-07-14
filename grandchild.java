import java.util.*;

public class grandchild{
    public static int countgc(String[][] names, String target) {
        int gcCount = 0;
        for (int i = 0; i < names.length; i++) {
            String child = names[i][0];
            String father = names[i][1];
            if (father.equals(target)) {
                for (int j = 0; j < names.length; j++) {
                
                    if (names[j][1].equals(child)) {
                        gcCount++;
                    }
                }
            }
        }

        return gcCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of parent-child : ");
        int num = sc.nextInt();
        String[][] names = new String[num][2];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter child " + (i + 1)+":" );
            String child = sc.next();
            
            System.out.print("Enter father " + (i + 1)+":" );
            String father = sc.next();
            
            names[i][0] = child;
            names[i][1] = father;
        }
        System.out.print("Enter the name to find number of grandchildren: ");
        String target = sc.next();

        int grandchildren = countgc(names, target);
        System.out.println("Number of grandchildren for " + target + ":" + grandchildren);
    }
}
