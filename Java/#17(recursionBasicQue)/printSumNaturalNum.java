public class printSumNaturalNum {
    public static void printSum(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printSum(i+1,n,sum);
        System.out.println(sum);
        System.out.println("this is i : " + i);
    }
    public static void main(String[] args) {
        printSum(1,5,0);//we initialised directly while calling the function , we could also initialise them seperately
    }
}
