import java.util.*;
public class calculatesum {
    public static int sumOfTwoNos (int a, int b){
int sum=a+b;
return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num for a");
        int a=sc.nextInt();
        System.out.println("enter a num for b");
        int b=sc.nextInt();
        int sum=sumOfTwoNos(a, b);
        System.out.println("the sum of two no.s is " +sum);
        sc.close();
    }
}
