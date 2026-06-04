class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        vector<int> pos ;
        vector<int> neg ;
        for(int i =0; i< nums.size() ; i++){
            if(nums[i]<0){
                neg.push_back(nums[i]);
            }else{
                pos.push_back(nums[i]);
            }
        }

        int i , j ,k =0;
        while(k < nums.size()){
            nums[k] = pos[i] ;
            i++;
            k++;
            nums[k]=neg[j];
            j++;
            k++;            
        }
        return nums;
    }
};