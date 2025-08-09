public class stackheightlogn {
    public static int calcfunction(int x, int n){
        if (n == 0){
            return 1;
    }
        if (x == 0){
            return 0;
    }
    // if the n is even
    if( n%2 == 0){
     return  calcfunction(x, n/2) * calcfunction(x, n/2);
      
    }
    else{
        return calcfunction(x, n/2) * calcfunction(x, n/2) * x;
            }
}
public static void main(String[] args) {
    int x=2,n=3;
    int ans =calcfunction(x, n);
    System.out.println(ans); 
}
}