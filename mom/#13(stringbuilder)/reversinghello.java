// public class reversinghello {
//     public static void main(String[] args) {
//         StringBuilder  sb = new StringBuilder("hello");

// for(int i=0;i<sb.length()/2;i++){

// int front=i;
// int back=sb.length()-i-1;

// char frontChar=sb.charAt(front);
// char backChar= sb.charAt(back);

// sb.setCharAt(front,backChar);
// sb.setCharAt(back,frontChar);
// }
// System.out.println(sb);

//     }
// }

public class reversinghello{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("leetcode");
        
        for(int i=0;i<sb.length()/2;i++){
        int front=i;
        int back=sb.length()-i-1;

char frontchar=sb.charAt(front);
char backchar=sb.charAt(back);

sb.setCharAt(front,backchar);
sb.setCharAt(back,frontchar);
        }
  System.out.println(sb);

    }
}