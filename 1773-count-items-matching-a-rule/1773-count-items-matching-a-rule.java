class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int n = items.size();
        int flag;
        if(ruleKey.equals("type")){
            flag =0;
        } else if(ruleKey.equals("color")){
            flag=1;

        } else{
            flag=2;
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(items.get(i).get(flag).equals(ruleValue)){
                c++;
            }
        }
        return c;
    }
}