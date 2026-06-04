class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int s =0;
        int e = letters.length -1;
        int mid = 0;
        int pos = -1;
        while(s<=e){
            mid = s + (e -s)/2;
            if( letters[mid]>target){
                pos =mid;
                e = mid-1;
            }else{
                s= mid+1;
            }


        }
        if(pos == -1){
            return letters[0];
        }else{
            return letters[pos];
        }
    }
}