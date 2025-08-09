public class deleteElement {
 public static void main(String[] args) {
     int[] arr = {1, 2, 3, 4, 5};
        int pos = 2; 

        int[] newArr = new int[arr.length - 1];

        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

        for (int i = pos + 1; i < arr.length; i++) {
            newArr[i - 1] = arr[i];
        }

        for (int x : newArr) {
            System.out.print(x + " ");
        }
}   
}
