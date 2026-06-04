// User function Template for Java

class Solution {
    int sumOfSeries(int n) {
        // code here
        
        return calculate(1,n,0);
    }
    
    int calculate(int i , int n , int s){
        if(i>n){
            return s;
        }else{
            s =  s + (int) Math.pow(i , 3);
            return calculate(i+1,n,s);
            
        }
        
    }
}
