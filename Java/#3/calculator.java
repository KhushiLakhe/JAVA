import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value for a:");
        int a=sc.nextInt();
        System.out.println("enter a value for b:");
       int b=sc.nextInt();
       System.out.println("enter the operation");
       System.out.println("enter 1:+,2:-,3:*,4:%");
    int button=sc.nextInt();
    int result=0;   // declare before  switch case by defaultit will store value zero
switch(button){ 
    case 1: result = a+b;
break;
case 2:  result = a-b;
break;
case 3: result = a*b;
break;
case 4 :result =a%b;
break;
default: System.out.println("invalid case");
}
System.out.println("Result: " + result);
sc.close();
    }
}
