package importantQuestion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int i,fact = 1;
        for (i=n;i>=1;i--) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
