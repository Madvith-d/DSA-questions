// User function Template for Java

class Solution {
    void leftRotate(int arr[], int d) {
        // code here
        int n = arr.length;
        d = d % n;
        reverse(arr , 0 , n-1);
        reverse(arr, n-d , n-1);
        reverse(arr , 0 , n-d-1);
    }
    void reverse(int arr[], int s, int e){

        int temp = 0;
        while(s<=e){
            temp = arr[s];
            arr[s]= arr[e];
            arr[e]=temp;
            e--;
            s++;
        }
    }
}
