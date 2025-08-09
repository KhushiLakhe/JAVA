import java.util.*;
public class arrayindex{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("enetr no of cols");
            int rows= sc.nextInt();
            System.out.println("enter no of rows");
            int cols= sc.nextInt();
            int[][] index= new int[rows][cols];
            // input
            for(int i=0;i<rows;i++){// rows
                for(int j=0;j<cols;j++){
                    index[i][j]=sc.nextInt();
                }}
                //to search index
                System.out.println("enter the num you want to search");
                int num=sc.nextInt();
                for(int i=0;i<rows;i++){// rows
        for(int j=0;j<cols;j++){
    if(index[i][j] == num){
        System.out.println("num found,("+i+","+j+")");
    }
        }
        }
        sc.close();
    }
}
