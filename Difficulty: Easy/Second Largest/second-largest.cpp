class Solution {
  public:
    int getSecondLargest(vector<int> &arr) {
        // code here
        int first = -1;
        int sec =  -1;
        if(arr.size()<2){
            return -1;
        }
        for(auto it = arr.begin() ; it != arr.end() ; it++){
            if( *it > first ){
                sec = first  ;
                first = *it ;
            }else{
                
                if(*it > sec && *it != first){
                    sec = *it;
                }else{
                    continue;
                }
            }
        }
        
        return sec;
    }
};