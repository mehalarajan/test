import java.util.Scanner;
public class Fibo {
   public static void main(String[] args){
           int i= 1, n = 10, a = 0, b = 1;
           System.out.println("Fibonacci Series till " + n );
           while (i <= n) {
               System.out.print(a + ", ");
               int nextTerm = a + b;
               a = b;
               b = nextTerm;
               i++;
           }

       }

   }


