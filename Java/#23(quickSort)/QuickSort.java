public class QuickSort{
    public static int partition( int arr[], int low, int high){ //it will return int because it has to finally return our pivot index
        int pivot = arr[high]; // koi bhi element pivot le skte hai but is code main hamne pivot as last element liyaa hai
        int i = low-1;  // will track how much space should be left empty so that elements smaller than pivot could fill them
        // low-1  means assuming their is not a single element smaller than pivot
         for(int j=low; j<high; j++){
            if(arr[j] < pivot ){
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
         }
         i++;
         int temp = arr[i];
         arr[i]= pivot;
         arr[high] = temp;//arr[high] = pivot
         return i; // pivot index

    }
    public static void Qsort(int arr[], int low, int high){
        if(low < high){
            int pivindx = partition(arr, low, high); // quick sort ki saari necessary info lauta k dega

            Qsort(arr, low , pivindx-1); // piv k pehle walle elements
            Qsort(arr, pivindx+1 , high); // piv k baad walle elements
        }
    }
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        Qsort(arr, 0, n-1);
        // print
     for(int i = 0; i<n; i++){
        System.out.print(arr[i]+" ");
     }   
    }
}