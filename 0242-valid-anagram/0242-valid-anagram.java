class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> mp = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0 ; i <s.length() ; i++ ){
            char c = s.charAt(i);
            mp.put( c , mp.getOrDefault( c , 0) + 1);
        }

        for(int i = 0 ;  i < t.length() ; i++){
            if(mp.containsKey(t.charAt(i))){
               Integer count = mp.get(t.charAt(i));
               if(count == null){
                return false;
               }else{
                mp.put( t.charAt(i) , count -1 );
               }
            }else{
                return false;
            }
        }

        for(Map.Entry<Character , Integer> entry : mp.entrySet()){
            if(entry.getValue() != 0){
                return false;
            }
        }

        return true;
    }
}