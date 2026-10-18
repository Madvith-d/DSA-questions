class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> st = new Stack<>();
        int res[] = new int[temp.length];

        for(int i  = 0 ; i < temp.length ; i++){
            if(st.isEmpty()){
                st.push(i);
            }else{
                while(!st.isEmpty() && temp[st.peek()]  < temp[i] ){
                    int idx = st.pop();
                    res[idx] = i - idx;
                }

                st.push(i);
            }
        }

        while(!st.isEmpty()){
            int idx = st.pop() ;
            res[idx] = 0;
        }

        return res ;
    }
}