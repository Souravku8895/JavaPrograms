package string;

import java.sql.SQLOutput;

public class Display {
    public static void main (String args []){
        String fname = "SOURAV";
        String lname = "SWAIN";
        System.out.println(fname + " " + lname);
        String x ="SOURAV KUMAR";
        System.out.println(x.length());
        String y ="SOURAV KUMAR";
        System.out.println(y.indexOf("K"));
        String a="SOURAV ";
        String b="KUMAR";
        System.out.println(a.concat(b));
        String c="10";
        String d="20";
        String e=c+d;
        System.out.println(e);


    }

}
