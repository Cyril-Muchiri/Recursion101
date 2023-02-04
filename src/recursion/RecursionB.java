package recursion;

import java.util.Arrays;
import java.util.Scanner;

class AccesControl{
    private int a;
    public int b;

    void seta(int i){
a=i;
    }
    int  geta(){
return a;
    }
}
public class RecursionB {
public static void main(String args []){

    AccesControl ob=new AccesControl();
    ob.seta(20);
    //set b
    ob.b=200;
    System.out.println(ob.geta());
    System.out.println(ob.b);

}}