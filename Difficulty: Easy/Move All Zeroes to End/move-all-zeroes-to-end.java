class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int t = -1;
        int i =0;
        while(i<arr.length){
            if(arr[i]!=0){
                t++;
                arr[t]=arr[i];
                
                
            }
            i++;
        }
        
        for( i = t+1;i<arr.length;i++){
            arr[i]=0;
        }
    }
}