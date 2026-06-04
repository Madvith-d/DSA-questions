class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        int ans = 0;
        int mid = 0;
        while(s!=e){
            mid = s + (e - s)/2;
            
           
            if(arr[mid]>arr[mid+1]){
                e=mid;
            }else if(arr[mid]<arr[mid+1]){
                s = mid+1;
            }
        }
        return s;
    }
}