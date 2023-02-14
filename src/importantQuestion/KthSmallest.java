package importantQuestion;

public class KthSmallest {
    public static void main(String[]args) {
        int[] a={56,82,23,99,54};
        int k=1;
        for (int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            if(i==k-1){
                System.out.println(k+" Smallest number is "+a[i]);
            }
        }
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}