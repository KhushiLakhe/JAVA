public class towerOfHanoi{
    public static void tower (int n, String src , String helper , String desti){
        if( n == 1){
            return;
        }
        tower(n-1 , src , desti , helper);
        System.out.println("transfer disk "+n+" from "+src+" destination");
        tower(n-1, helper, src, desti);
    }
    public static void main(String args[]){
        int n=3;
    tower(n, "S" , "H" , "D");
    }
}
// learn this
//  time complexity of tower of hanoi is O(2^n - 1) i.e O(2n )