import java.util.*;
public class function_table_n {
public static void table(int n){
  
    for(int i=1;i<=10;i++){
        int k=n*i;
        System.out.println(n+"x"+i+"="+k);
    }
   }
public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number for table");
int num=sc.nextInt();
table(num);
sc.close();
}
}
