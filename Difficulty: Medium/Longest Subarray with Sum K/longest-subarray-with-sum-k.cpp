class Solution {
  public:
    int longestSubarray(vector<int>& arr, int k) {
        // code here
        unordered_map<int , int> mp;
        int psum = 0; 
        int res = 0;
        for(int i = 0 ; i <arr.size() ; i++){
            psum+= arr[i];
            
            if(psum == k){
                res = max(res , i+1);
            }
            
            if(mp.find(psum - k) != mp.end()){
                res = max(res , i - (mp[psum - k]));
            }
            if(mp.find(psum) == mp.end()){
                mp[psum] = i ;
            }
        }
        
        return res;
    }
};