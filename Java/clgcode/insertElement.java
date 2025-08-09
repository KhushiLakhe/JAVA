public class insertElement {
    public static void main(String [] args){
        int arr[]= {5,9,7,6,3};
        int element = 13;
        int pos = 3;
        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

        newArr[pos] = element;

        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        // for (int x : newArr) {
        //     System.out.print(x + " ");
        // }
        for (int i = 0; i < newArr.length; i++) {
        System.out.print(newArr[i] + " ");
}

    }
}
