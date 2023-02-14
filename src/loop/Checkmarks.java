package loop;

public class Checkmarks {
    public static void main(String[]args){
        int mark=75;
        if(mark<33){
            System.out.println("Fail");
        }
        else if(mark>=50 && mark<60){
            System.out.println("B grade");
        }
        else if(mark>=60 && mark<85){
            System.out.println("A grade");
        }
        else if(mark>=85) {
            System.out.println("O grade");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
