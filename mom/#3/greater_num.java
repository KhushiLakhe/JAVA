import java.util.*;
public class greater_num {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number in a:");
        Float a= sc.nextFloat();
        System.out.println("enter a number in b:");
        Float b= sc.nextFloat();
if(a>b){  //agar (a==b) kiya hota toh a aur b same hai kya ye check krta
    System.out.println("a is greater than b");
}
else if(b>a){
    System.out.println("b is greater than a");
}
else{
    System.out.println("a is equal to b");
}
    }
    
}
