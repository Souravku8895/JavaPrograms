package importantQuestion;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int temp = n ,rem,rev = 0;
        while (temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(n==rev){
            System.out.println(n + " " +"is palindrom");
        }
        else{
            System.out.println(n + " " +"is not palindrom");
        }
    }

}
