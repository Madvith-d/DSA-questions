// User function Template for Java

class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        // Your code here
        int res[] = new int[n];
        
        int fact = 0;
        for(int i=0;i<n;i++){
            res[i]= fib(i);
        }
        return res;
        
    }
    
    static int fib(int n ){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
}