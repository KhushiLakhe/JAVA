public class abcBacktracking{
    public static void printPermutaion(String str, String perm, int indx ){ // perm sare possible arrangements ko ek ek krke store krega 
        if(str.length == 0){
            System.out.println(perm);
            return;
        }
            for(int i=0;i<str.length();i++){
                char currentchar = str.charAt(i);
                String newStr = str.substring(0,i) + str.substring(i+1); // is se char at i ko hata diya
                printPermutaion(newStr, perm + currentChar, indx+1);
                
            }
    }
    public static void main(String[] args) {
        String str="ABC";
        printPermutaion(str, "", 0);
    }
}