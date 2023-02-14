package importantQuestion;

import java.util.Scanner;

public class Addtwonumbers {
    public static void main(String[]args){
        Scanner add =new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int x,y,z;
        x = add.nextInt();
        y= add.nextInt();
        z=x+y;
        System.out.println(z);
    }
}
