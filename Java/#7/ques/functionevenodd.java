import java.util.*;
public class functionevenodd {
    public static boolean evenOrOdd(int n){
        if(n<0){
            return false;
        }
        if(n%2==0){
            return true;
        }
   else {
     return false;
    }
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("eneter any number");
    int num=sc.nextInt();
    if(evenOrOdd(num)){
        System.out.println(num+" the num is even");
    }
else{
    System.out.println(num+" the num is odd");
}
sc.close();
}
}
