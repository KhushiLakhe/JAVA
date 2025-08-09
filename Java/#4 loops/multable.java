// using while lo
// import java.util.*;
// public class multable {
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// System.out.println("enter the no. for multiplication table:");
// int n=sc.nextInt();
// int table=0;
// int i=1;
// while(i<=10){
// table = i*n;
// i++;
// System.out.println(table);
// }
// }
// }
 
// using for loop
import java.util.*;
public class multable{
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the no for table");
int n= sc.nextInt();
int table=0;
for(int i=1;i<=10;i++){
    table = i*n;
    System.out.println(table);
} 
    }
}