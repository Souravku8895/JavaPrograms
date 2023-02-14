package importantQuestion;

import java.sql.SQLOutput;

public class KthLargest {
    public static void main(String[]args){
        int[] a={21,60,78,35,1};
        int k=2;
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[j]>a[i]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            if(i==k-1){
                System.out.println(k+" Largest number is "+a[i]);
                break;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
