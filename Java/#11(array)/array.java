import java.util.*;
public class array{
    public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("enter the num of rows");
int rows=sc.nextInt();
System.out.println("enter the num of cols");
int cols=sc.nextInt();

int[][] num=new int[rows][cols]; //2D array banan rahe hai iska declaration hai
// input
System.out.println("enter the desired matrix");
// rows
for (int i=0;i<rows;i++){
// columns
for(int j=0;j<cols;j++){
    num[i][j]=sc.nextInt();  //num[i][j] :- cell address and elemts save kr rahe ithar
}
}
// output
for(int i=0;i<rows;i++){
    for(int j=0;j<cols;j++){
        System.out.print(num[i][j]+" "); //elemnts print krne k liye
    }
    System.out.println(); //next line print krne k liye (suppose c=4 toh jb c=5 hoga tb vo loop k bahar chala jaega and next line print krga)
}
sc.close();
}
    }

// prac bitch //
// import java.util.*;
// public class array{
//     public static void main(String[]args){
//         Scanner sc= new Scanner(System.in);
//         System.out.println("enter the num of rows");
//         int rows=sc.nextInt();
//         System.out.println("enter the num of cols");
//         int cols=sc.nextInt();
//   int[][] bitch = new int[rows][cols]; // declaration of 2D  array
// //   input
// // rows
// for(int i=0;i<rows;i++){
//     // columns
//     for(int j=0;j<cols;j++){
//          bitch[i][j]=sc.nextInt();
//     }
// } 
// // output
// for(int i=0;i<rows;i++){
// for(int j=0;j<cols;j++){
//     System.out.print(bitch[i][j]+" ");
// }
// System.out.println();
// }
// sc.close();
//     }
// }