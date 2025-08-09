// public class prac{
//     public static boolean[] map= new boolean[26];
//     public static void duplicatesremoval(String str , int indx , String newstring){
//         if( indx == str.length()){
//             System.out.println(newstring);
//             return;
//         }
//         char currentchar = str.charAt(indx);
//         if(map[currentchar - 'a' ] == true){
//             duplicatesremoval( str , indx + 1, newstring);
//         }
//         else{
//             newstring += currentchar;
//             map[currentchar - 'a'] = true;
//             duplicatesremoval( str , indx+1 , newstring);
//         }
//     }
//     public static void main (String[] args){
//         String str = "aabbcadsa";
//         duplicatesremoval( str, 0 , "");
//     }
// }
