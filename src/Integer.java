import java.util.Scanner;
public class Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("enter the size:");
        int n = sc.nextInt();
        System.out.println("enter number of rows:");
        int rows = sc.nextInt();
        System.out.println("enter number of column:");
        int column = sc.nextInt();
        System.out.println("enter elements:");
        int a[][] = new int[rows][column];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
              if(i<j){
                  int k=i+j;
                  System.out.println(k);
              }
            }
        }

    }
}
