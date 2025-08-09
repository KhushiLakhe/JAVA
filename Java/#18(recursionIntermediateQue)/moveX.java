public class moveX {
    public static void moveAllX(String str , int indx , int count , String newString){
        if (indx == str.length()){
            for (int i=0;i<count;i++){
                newString+= 'x';
            }
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(indx);
        if(currentChar == 'x'){
            count ++;
            moveAllX(str, indx+1, count, newString);
        }
        else{
            newString+= currentChar; // newstring = newstring + currentChar
            moveAllX(str, indx+1, count, newString);
        }
    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        moveAllX(str, 0, 0, " ");
    }
}
