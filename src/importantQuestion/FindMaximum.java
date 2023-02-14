package importantQuestion;

public class FindMaximum {
    public static void main(String[]args){
        int[] a={21,52,87,83,99};
        int max=a[0];
        for (int i=0;i<a.length;i++){
            if (max<a[i]){
                max=a[i];
            }
        }
        System.out.println("maximum value is "+ max);
    }
}
