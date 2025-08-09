public class fabonacci {
    public static void fabonacciseries(int a,int b,int n){
       if(n==0){
     return;
       }
        int c=a+b;
       System.out.println(c);
       fabonacciseries(b, c, n-1);
        }
     
    public static void main(String[] args) {
       int a=0,b=1;
       System.out.println(a);
       System.out.println(b);
       int n=10;
       fabonacciseries(a, b,n-2);// n-2 because we have allready printed a&b
    }
}