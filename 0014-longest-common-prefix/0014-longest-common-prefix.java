class Solution {
    public String longestCommonPrefix(String[] strs) {
        int i  = 0 ;

        int n = strs.length ;
        if(n == 1){
            return strs[0];
        }
        int flag = 0;
        while(flag==0){
        
            for(int j = 1 ; j < n ; j ++){

                if(! (i<strs[j].length()) || !(i<strs[0].length())){
                    
                    flag =1 ;
                    break;
                }
                if(strs[j].charAt(i) == strs[0].charAt(i)){
                    continue;
                }else{
                    return strs[0].substring(0,i);
                }
            }

            i++;
        }
        if(flag==0){
            return strs[0].substring(0,i);
        }else{
            return strs[0].substring(0,i-1);
        }
        

    }
}