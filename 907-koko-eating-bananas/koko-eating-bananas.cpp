class Solution {
public:
    int minEatingSpeed(vector<int>& piles, int h) {
        int l = 1 ;
        auto maxit = max_element(piles.begin() , piles.end());
        int m = *maxit;
        int k;

        while(l<=m){
            k = l + (m-l)/2 ;
            if(  check(piles, k , h) <= h){
                m = k-1;

            }else{
                l=k+1;
            }
        }
        return l;

    }
int check(vector<int>& piles , int k , int h){
       int sum = 0;
        for(int i = 0 ; i < piles.size() ; i++){
            sum = sum + ((piles[i] + k - 1)/k);
            if(sum>h){
                return sum;
            }else{
                continue;
            }
        }
        return sum;
    }
};