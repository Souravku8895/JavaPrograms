package importantQuestion;

import java.util.Scanner;

public class Fibonaci {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int x=0,y=1,z,i,n;
        n=sc.nextInt();
        System.out.print( x + " " + y);
        for(i=2;i< n;i++){
            z=x+y;
            System.out.print(" " +z);
            x=y;
            y=z;
        }
    }
}
