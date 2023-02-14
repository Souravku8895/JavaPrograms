package importantQuestion;

public class LinearSearch2 {
    public static void main(String[]args){
        String[] a={"DEEPAK","KANHA","PIYUSH","RAJAT","DHONI"};
        String item="DHONI";int temp=0;
        for (int i=0;i<a.length;i++){
            if(a[i].equals(item)){
                System.out.println(i);
                temp=temp+1;
            }

        }
        if(temp==0){
            System.out.println("Name is not in the list");
        }
    }
}
