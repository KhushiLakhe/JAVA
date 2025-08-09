public class Msort {
    public static void Conquer(int arr[],int mid,int si , int ei){
        int merged[] = new int[ ei - si +1];
        
        int indx1 = si; // tracks 1st array
        int indx2 = mid + 1; // tracks 2nd array
        int x = 0;  // tracks index in merged array

        while(indx1 <= mid && indx2 <= ei){
            if ( arr[indx1] <= arr[indx2]){
                merged[x++]=arr[indx1++];  
            }
            else{
                merged[x++]= arr[indx2++];
            }
        }
        while(indx1 <= mid){
            merged[x++]=arr[indx1++];
        }
        while(indx2 <= ei){
             merged[x++]= arr[indx2++];
        }
        // original array main merged k elements ko copy krna hai
        //i is used to iterate through the merged[] array 
        //j is used to track the index in the original arr[]
        for(int i=0, j=si;i<merged.length;i++ , j++){
            arr[j]=merged[i];
            // System.out.println(merged[i]); // we cant put thid statement
        }
    }
    public static void Divide(int arr[],int si , int ei){
        // BASE CASE - si>=ei :- (0, 0) or 
        if(si>=ei){ 
            // System.out.println();
            return;
        }
        int mid = si + (ei - si) / 2; // here we could also take mid = (si+ei)/2 but in big no.s it could cause space prblm and the no. could exceed int value 
        Divide(arr,si,mid);
        Divide(arr,mid+1,ei);
        Conquer(arr, mid ,si,ei);
    }
    public static void main (String [] args){
        int arr[]={6,3,9,5,2,8};
        int n=arr.length;
        Divide(arr, 0, n-1);
        // print
        for(int i = 0; i<n ;i++){
            System.out.print(arr[i] + " ");
        }
    }
}