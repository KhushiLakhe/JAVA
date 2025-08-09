// public class concantenateArray {
//     public static void main(String[] args) {
//         int array1[]={1,2,3};
// int array2[]={4,5,6};
// int array3[]=new int[array1.length + array2.length]; // [array1.length + array2.length] by doing this we are declairing the size pf new array that is array3 
// // input
// for(int i=0;i<array1.length;i++){
// array3[i]=array1[i];
// }
// for(int i=0;i<array2.length;i++){
//     array3[array1.length+i]=array2[i];
// }
// // output
// for(int i=0;i<array3.length;i++){
// int array4=array3[i];
// System.out.print(array4);
// }
//     }
// }
public class concantenateArray{
    public static void main(String[] args) {
        int array1[]={4,5,6};
int array2[]={7,8,9};
int array3[]=new int[array1.length+array2.length];
for(int i=0;i<array1.length;i++){
    array3[i]=array1[i];
}
for(int i=0;i<array2.length;i++){
    array3[array1.length+1]=array2[i];
}
for(int array4 : array3){ // this is simliar to the above for loop , it states that in array4 all the elements stored in array3 will be stored
System.out.print(array4 + " ");
}
    }
}