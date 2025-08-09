public class removeDuplicates {
    public static boolean[] map = new boolean[26]; 

    public static void duplicatesRemoval( String str , int indx , String newString) {
        // base case
        if(indx == str.length()){
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(indx);
        if(map[currentChar - 'a'] == true){
        duplicatesRemoval(str , indx +1 ,newString);
        }
        else{
            newString += currentChar;
            map[currentChar - 'a'] = true;
            duplicatesRemoval(str, indx+1, newString);
        }
    }
    public static void main(String[] args) {
        String str = "aabbcda";
        duplicatesRemoval(str, 0, "");
    }
}
