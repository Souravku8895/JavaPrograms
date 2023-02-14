package importantQuestion;

public class LinearSearch {
    public static void main(String[]args){
        int[] a={2,9,8,5,7,6,3};
        int item=70;int temp=0;
        for (int i=0;i<a.length;i++){
            if(a[i]==item){
                System.out.println(i);
                 temp=temp+1;
            }

        }
        if(temp==0){
            System.out.println("No is not in the list");
        }
    }
}
