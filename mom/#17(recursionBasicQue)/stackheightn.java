public class stackheightn {
  public static int calcpower(int x, int n){
    if( n == 0 ){
        return 1;// base case
    }
    if ( x == 0 ){
        return 0; //base case
    }
    int a=calcpower(x, n-1);
    int b=x*a;
    // System.out.println(b); 
    return b;
  }
  public static void main(String [] args){
    int x=2,n=3;
    int ans = calcpower(x, n);
    System.out.println(ans);
  }
}
