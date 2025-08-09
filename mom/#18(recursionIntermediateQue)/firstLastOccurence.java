public class firstLastOccurence {
    //  static variables values does not change throughout the recursion level
    public static int first = -1;
    public static int last = -1;
    public static void findOccurence(String str, int indx , char element){
        if(indx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currchar = str.charAt(indx);
        if (currchar == element){
            if(first == -1){
                first = indx;
            }
           else{ 
            last = indx;
        }
    }
        findOccurence(str, indx+1, element);
    }
    public static void main(String[] args) {
        String str = "baacdae"; // array length = 7 and indexes are from 0-6
        findOccurence(str, 0 ,'a');
        System.out.println("First occurence : " + first);
        System.out.println("Last occurence : " + last);
    }
}
