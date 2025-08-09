import java.util.*;
public class q1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the no. of even no. required");
        int n = sc.nextInt();
       
        for(int i=1;i<=n;i++){
if(i%2==0){ 
System.out.println(i);
        }
    }
    sc.close();
}
}