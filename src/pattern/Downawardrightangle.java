package pattern;

public class Downawardrightangle {
    public static void main(String[]args){
        int i;
        int j;
        int n=5;
        for(i=0;i<n;i++){
            for(j=n-i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
