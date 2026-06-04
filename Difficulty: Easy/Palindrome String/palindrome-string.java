class Solution {
    boolean isPalindrome(String s) {
        // code here
        s= s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String temp = s;
        int l = 0;
        int r = s.length()-1;
       

        while(l<=r){
            if(s.charAt(l)== s.charAt(r)){
                l++;
                r--;
                continue;
            }else{
                return false;
            }
        }

        return true;
    }
}