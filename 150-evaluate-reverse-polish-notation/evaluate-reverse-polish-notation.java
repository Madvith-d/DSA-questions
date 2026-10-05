class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(int i = 0 ; i < tokens.length ; i++){
            if(isInteger(tokens[i])){
                st.push(Integer.parseInt(tokens[i]));
            }else{
                int op2 = st.pop();
                int op1 = st.pop();
                int res = 0;
                switch(tokens[i]){
                    case "+":
                        res = op1+op2;
                        break;
                    case "-":
                        res = op1 - op2;
                        break;
                    case "*":
                        res = op1 * op2;
                        break;
                    case "/":
                        res = op1/op2;
                        break;
                }

                st.push(res);
            }
        }

        return st.pop();
    }

    public static boolean isInteger(String str){
        try{
            Integer.parseInt(str);
            return true;
        }catch(NumberFormatException e){
            return false ;
        }
    }
}