class Solution {
    void selectionSort(int[] arr) {
        // code here
        int i=0;
        int j=0;
        int min =0;
        int temp;
         
        for( i = 0 ; i<arr.length;i++){
            min = i;
            for (j=i+1 ; j< arr.length ; j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            temp = arr[i];
            arr[i]= arr[min];
            arr[min]=temp;
            
        }
    }
}