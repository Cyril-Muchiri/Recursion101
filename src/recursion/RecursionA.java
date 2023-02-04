package recursion;

public class RecursionA {
int factorial(int a){
    int result;
    if (a==1) return 1;
    result=factorial(a-1)*a;

    System.out.println(a);
    return result;
    }
 }
 class Demo{
    public static void main(String args[]){
        RecursionA f = new RecursionA();
int y=5;
        System.out.println("factorial of " +y+" is: "+f.factorial(y));
    }
 }
