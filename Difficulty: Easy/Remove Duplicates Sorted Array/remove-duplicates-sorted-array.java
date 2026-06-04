class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> dup = new ArrayList<>();
        int top = 0;
        dup.add(arr[0]);
        for(int i = 1; i<arr.length;i++ ){
            if(arr[top]!=arr[i]){
                dup.add(arr[i]);
                top = i;
                
            }else{
                top++;
            }
        }
        
        return dup;
    }
}
