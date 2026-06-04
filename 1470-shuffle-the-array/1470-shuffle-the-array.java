class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[] = new int[2*n];
        int s =0;
        int e = n;
        for(int i=0;i<2*n;i++){
            if(i%2==0){
                arr[i]=nums[s];
                s++;
            }
            else{
                arr[i]=nums[e];
                e++;
            }
        }
        return arr;
    }
}