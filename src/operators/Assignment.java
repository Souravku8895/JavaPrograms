package operators;

public class Assignment {
    public static void main (String [] args){
        int x= 10;
        x+=5;
        int y= 10;
        y-=5;
        int z= 10;
        z*= 5;
        int a= 10;
        a/=5;
        int b= 10;
         b%= 5;
         boolean c= true;
         boolean d = false;
         boolean e = c & d;
         boolean f = c | d;
         int g=10;
         g >>= 5;
        System.out.println("Assignsum is " + x);
        System.out.println("Assignsub is " + y);
        System.out.println("AssignMul is " + z);
        System.out.println("Assigndiv is " + a);
        System.out.println("Assignmod is " + b);
        System.out.println("Assignand is " + e);
        System.out.println("Assignor is " + f);
        System.out.println("Assignrshift is " + g);

    }
}
