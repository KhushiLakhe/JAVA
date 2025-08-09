import java.util.*;
public class functionprime{
    public static boolean primeOrNot(int n){
if(n<=1){
return false;
}
for(int i=2;i<n;i++){
    if(n%i==0){
        return false;
    }
}
return true;
}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a num");
    int num= sc.nextInt();
if(primeOrNot(num)){
    System.out.println("the num is prime");
}
else{
    System.out.println("the num is not prime");
}
sc.close();
}
}