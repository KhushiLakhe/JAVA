class bubblesort{
public static void printArray(int arr[]){
for (int i=0;i<arr.length;i++){ //This method prints all the elements of the array arr
System.out.println(arr[i]+" ");
}
System.out.println();
} 
    public static void main(String[] args){
        int arr[]={3,6,8,2,1,9,4};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){ //Inner Loop (j) compares adjacent elements
                if(arr[j]>arr[j+1]){
                    //swap //If the current element arr[j] is greater than the next arr[j+1], they are swapped.
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printArray(arr);
    }
}