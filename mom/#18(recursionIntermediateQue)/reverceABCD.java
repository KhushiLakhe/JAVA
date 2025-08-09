// public class reverceABCD {
//     public static void printreverse(int indx , String str ){
//         if(indx == 0){
//         System.out.println(str.charAt(indx));
//         return;
//     }
//     printreverse(indx-1, str);
//     System.out.println(str.charAt(indx));
//     }
//     public static void main (String args[]){
//         String str = "ABCD";
//         printreverse(str.length()-1,str);
//     }   
// }
//CORRECT
public class reverceABCD{
    public static void printreverse(int indx, String str){
        if (indx == 0){
            System.out.println(str.charAt(indx));
            return;
        }
        System.out.println(str.charAt(indx));
        printreverse(indx-1, str);
    }
        
    public static void main(String args[]) {
        String str ="ABCD";
        printreverse(str.length()-1, str);
    }
}
