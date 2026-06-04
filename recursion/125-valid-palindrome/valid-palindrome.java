class Solution {
    public boolean isPalindrome(String s) {
        s= s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        
        int l = 0;
        int r = s.length()-1;
       

        return check(s,l,r);
    }
    public boolean check(String s , int l , int r){
        if(l>r){
            return true;
        }

        if(s.charAt(l)==s.charAt(r)){
            l++;
            r--;
            return check(s ,l,r);
        }else{
            return false;
        }
    }
}