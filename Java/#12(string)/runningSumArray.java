// public class runningSumArray { 
//     public static void main(String[] args) {
//         int [] array1={1,2,3,4,5,6};
//         int [] array2=new int[array1.length];
//         array2[0]=array1[0];
//         for(int i=1;i<array1.length;i++){
//  array2[i]=array2[i-1]+array1[i];
//         }
//         for(int array3 : array2){
//         System.out.print(array3 + " ");
//     }}
// }
class runningSumArray {
    public static void main(String[] args) {
        int[] array1= {1,2,3,4,5,6};
        int[] array2= new int[array1.length];
    array2[0]= array1[0];
    for(int i=1;i<array1.length;i++){
        array2[i]=array2[i-1]+array1[i];    
    }
    for(int array3 : array2){
        System.out.print(array3 + " ");
    }
    }
}