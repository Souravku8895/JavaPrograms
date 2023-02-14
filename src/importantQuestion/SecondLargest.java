package importantQuestion;

public class SecondLargest {
    public static void main(String[]args){
        int[] a={52,46,8,100,32};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[j]>a[i]){
                    int temp=a[i];
                            a[i]=a[j];
                            a[j]=temp;
                }
            }
        }
         {
            System.out.println("Second largest element is " +a[1]);
        }
    }
}
