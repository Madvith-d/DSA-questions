class Solution {
  public:
    vector<int> removeDuplicates(vector<int> &arr) {
        // code here
        if(arr.size()<=1){
            return arr;
        }
        vector<int> v ={0};
        int  top = 0;
        v[top] = arr[top];
        for(int cur = 1; cur < arr.size() ; cur++){
            if(v[top]!= arr[cur]){
                top++;
                v.push_back(arr[cur]);
                
            }
        }
        
        return v;
    }
};