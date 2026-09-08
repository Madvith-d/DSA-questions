class Solution {
    public int countCommas(int n) {
        int res = 0;
        int count = 0;
        int temp = n;
        int rem;
        if(n <1000){
            return 0;
        }
        while(temp!=0){
            rem = temp /10;
            temp = temp/10;
            count++;
            if(count%3==0){
                res++;
            }
        }
        
        return (n - 999) * 1 ;
    }
}