import java.util.*;
public class getbits{
public static void main (String[] args){
int n=5;// 0101
int pos=3;
int bitmask=1<<pos;// 1 ko left shift krna hai pos times
if((bitmask & n)==0){
    System.out.println("the bit was zero");
}
else{
    System.out.println("the bit was non-zero i.e. one ");
}
}
}


// explaination
// 0   1   0   1 #5
//(3) (2) (1) (0) - position
// shifting 1 by 2 position
// 0   1   0   0
//(3) (2) (1) (0) - position
// 0   1   0   1
//               AND
// 1   0   0   0    :- shifting 1 by 3 position times 1<<3
// ------------------
// 0   0   0   0   :- as it is zero the num we are getting is zero