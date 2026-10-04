class Solution {
    public boolean isValid(String s) {
        Deque<Character> s1 = new ArrayDeque<>();

        if((s.length() % 2 )!= 0){
            return false;
        }
        for(int  i = 0 ; i < s.length() ; i++ ){
            char c = s.charAt(i);
            switch(c){
                case '(':


                case '{':


                case '[':
                    s1.push(c);
                    break;
                case ')':
                    if(s1.isEmpty() || s1.pop() != '(' ){
                        return false;
                    }else{
                        break;
                    }
                case '}':
                     if(s1.isEmpty() || s1.pop() != '{' ){
                        return false;
                    }else{
                        break;
                    }
                case ']':
                     if(s1.isEmpty() || s1.pop() != '[' ){
                        return false;
                    }else{
                        break;
                    }
                
            }

            
        }
        if(s1.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}