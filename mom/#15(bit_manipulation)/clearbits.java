public class clearbits {
    public static void main (String [] args){
        int n=5; //0101
        int pos=2;
        int bitmask=1<<pos;
        int notbitmask = ~(bitmask);
        int clearbit = n & notbitmask;
        System.out.println(clearbit); 
    }
}
