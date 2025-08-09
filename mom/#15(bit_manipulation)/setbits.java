public class setbits {
    public static void main(String[] args){
        int n=5;//0101
        int pos=1;
        int num=1<<pos;// shifting 1 by pos times
        int bitmask= num | n;
System.out.println(bitmask);
    
    }
}
