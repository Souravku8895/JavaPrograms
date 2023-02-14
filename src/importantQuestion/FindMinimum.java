package importantQuestion;

public class FindMinimum {
    public static void main(String[]args){
        int[] a={52,65,89,1,0};
        int min=a[0];
        for (int i=0;i<a.length;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println("minimum value is "+min);
    }
}
