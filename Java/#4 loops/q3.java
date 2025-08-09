import java.util.*;
public class q3{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int button;
    int marks;
    do{
      System.out.println("enter 1 to proceede and 0 to stop");
       button=sc.nextInt();
      if(button==1){
        do{
          System.out.println("enter the marks of student");
          marks=sc.nextInt();
          if (marks<=100 && marks>=90){
            System.out.println("good marks");
          }
          else if(89>=marks && marks>=60){
            System.out.println("also good marks");
          }
          else if(59>=marks && marks>=0){
            System.out.println("these marks are good even");
          }
          else{
            System.out.println("marks entered are invalid");
          }
        }
        while( marks<=100 && marks>=0);
      }
      else if(button!=0){
System.out.println("invalid no. please enter 0 or 1");
      }
    }
    while(button != 0);
    System.out.println("STOP");
  }
}
  