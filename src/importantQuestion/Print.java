package importantQuestion;

import java.util.Scanner;

public class Print {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number :");
        int n = sc.nextInt();
        forLoopMethod(n);
        doWhileLoopMethod(n);
        whileLoopmethod(n);
    }
     public static void forLoopMethod(int n) {
         System.out.println("print 1 to 10");
         for ( int i = 1; i <= n; i++) {
             System.out.println(i);
         }
     }
     public static void whileLoopmethod(int n){
         System.out.println("print 1 to 10");
         int i =1;
         while (i<=n){
             System.out.println(i);
             i++;
         }
     }
     public static void doWhileLoopMethod(int n){
         System.out.println("print 1 to 10");
         int i=1;
         do {
             System.out.println(i);
             i++;
         }
             while (i<=n);

     }



}
