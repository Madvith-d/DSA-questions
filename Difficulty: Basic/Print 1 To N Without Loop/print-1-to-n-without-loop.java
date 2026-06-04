class Solution {
    public void printNos(int n) {
        // Code here
        print(n+1);
    }
    int print(int n){
        if(n==1){
            return 1;
            
        }else{
            System.out.print(print(n-1)+" ");
            return n;
        }
        
    }
    
    
}
