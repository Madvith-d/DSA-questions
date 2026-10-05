class Solution {
    public int[] dailyTemperatures(int[] temp) {
        record IntPair(int value , int index){}
        Stack<IntPair> st = new Stack<>();
        int ans[] = new int[temp.length];
        for(int i = 0 ; i < temp.length ; i ++){
            if(st.isEmpty()){
                IntPair p = new IntPair(temp[i],i);
                st.push(p);
            }else{
                while( !st.isEmpty() && st.peek().value < temp[i]){
                    IntPair k = st.pop();
                    ans[k.index] = i - k.index;
                }
                IntPair p = new IntPair(temp[i],i);
                st.push(p);
            }
        }
        if(!st.isEmpty()){
            IntPair k = st.pop();
            ans[k.index] = 0;
        }

        return ans;
    }
}