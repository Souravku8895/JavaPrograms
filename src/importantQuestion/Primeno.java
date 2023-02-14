package importantQuestion;

import java.util.Scanner;

public class Primeno {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int i,temp=0;
        for(i=2;i<=n-1;i++){
            if(n%i==0){
                temp=temp+1;
            }
        }
        if(temp > 0){
            System.out.println(n + " " +"is not prime");
        }
        else{
            System.out.println(n + " " +"is prime");
        }

    }
}
