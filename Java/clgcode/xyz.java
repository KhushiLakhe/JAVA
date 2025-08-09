public class xyz {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = arr.length;
        int element = 3;
        int pos = 2; // insert at index 2

        int[] newArr = new int[n + 1];

        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

        newArr[pos] = element;

        for (int i = pos; i < n; i++) {
            newArr[i + 1] = arr[i];
        }

        for (int x : newArr) {
            System.out.print(x + " ");
        }
    }
}
// public class SimpleDelete {
//     public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 5};
        // int n = arr.length;
        // int pos = 2; // delete element at index 2 (value 3)

        // int[] newArr = new int[n - 1];

        // for (int i = 0; i < pos; i++) {
        //     newArr[i] = arr[i];
        // }

        // for (int i = pos + 1; i < n; i++) {
        //     newArr[i - 1] = arr[i];
        // }

        // for (int x : newArr) {
        //     System.out.print(x + " ");
        // }
//     }
// }


