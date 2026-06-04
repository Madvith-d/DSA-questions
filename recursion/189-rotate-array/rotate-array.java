class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int s = 0;
        int e = nums.length -1;
        rev(nums,s,e);
        
        s =0;
        e= k-1;
        rev(nums,s,e);
        s=e+1;
        e= nums.length -1;
        rev(nums,s,e);
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