package importantQuestion;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
       int n=sc.nextInt();
        int t1=n;
        int leng =0;
        while (t1 != 0){
            leng=leng+1;
            t1=t1/10;
        }
        int t2=n,rem,arm=0;
        while(t2 != 0){
            rem=t2%10;
            int mul=1;
            for(int i=1;i<=leng;i++){
                mul=mul*rem;
            }
            arm=arm+mul;
            t2=t2/10;
        }
        if(arm==n){
            System.out.println("ARMSTRONG");
        }
        else {
            System.out.println("NOT ARMSTRONG");
        }
    }
}
