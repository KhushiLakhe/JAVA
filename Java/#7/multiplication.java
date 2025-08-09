import java.util.*;
public class multiplication {
    public static int multiply(int a, int b){
int mul= a*b;
return mul;
    }
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.print("enter no. for a: ");
     int a=sc.nextInt();
     System.out.print("enter no. for b: ");
     int b=sc.nextInt();
     int mul=multiply(a,b);
     System.out.println("the multiplication of two no.s is: "+mul);
     sc.close();
    }
}
