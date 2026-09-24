class Solution {
    public boolean isSubsequence(String s, String t) {
        int sp = 0 ; 
        int tp = 0;
        if(t.length() == 0  ){
            if(s.length() == 0){
                return true;
            }else{
                return false;
            }
        }
        if(s.length() == 0){
            return true;

        }

        
        while(tp<t.length() && sp<s.length()){
            if(t.charAt(tp) == s.charAt(sp)){
                tp++;
                sp++;
            }else{
                tp++;
            }
        }

        if(sp == s.length() ){
            return true;
        }else{
            return false;
        }
    }
}