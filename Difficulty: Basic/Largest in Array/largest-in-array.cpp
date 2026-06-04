class Solution {
  public:
    int largest(vector<int> &arr) {
        // code here
        auto max = arr.begin();
        for(auto x = arr.begin() ; x != arr.end() ; x++){
            if(*x > *max){
                max = x;
            }
        }
        
        return *max;
    }
};
