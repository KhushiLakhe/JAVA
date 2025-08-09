import java.util.*;
public class sumofn_num {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter a num for n");
    int n = sc.nextInt();
  int sum = 0; //creating a variable and initializing it as 0
  for(int i=1;i<=n;i++)
{
sum=i+sum;
}   
System.out.println(sum);
 }
  }