class Solution {
    void leftRotate(int arr[], int k) {
        k = k % arr.length;
        int s = 0;
        int e = arr.length -1;
        rev(arr,s,e);
        
        s =0;
        e=arr.length -1 - k;
        rev(arr,s,e);
        s=e+1;
        e= arr.length -1;
        rev(arr,s,e);
        
    }
    
    void rev(int arr[],int s,int e){
         while(s<=e){
            int temp = arr[s];
            arr[s]= arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}
