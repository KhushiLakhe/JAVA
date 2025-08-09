import java.util.*;
public class updatebit {
 public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter '1' to update as 1 and enter '0' to update as 0");
int n=sc.nextInt();
int num=5;
int bitmask=1<<2;
if(n == 1){
int one=num |bitmask;
System.out.println("youe updated number is"+one);
}
else{
    int notbitmask=~(bitmask);
    int zero = notbitmask & num;
System.out.println("your updated number is"+zero);
}
sc.close();
}
 }   

