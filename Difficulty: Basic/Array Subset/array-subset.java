
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        if(a.length<b.length){
            return false;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(map.containsKey(a[i])){
                map.put(a[i], map.get(a[i])+1);
            }else{
                map.put(a[i],1);
            }
        }
        
        for(int j=0;j<b.length;j++){
            
            if(map.get(b[j])==null || map.get(b[j])==0){
                return false;
            }
            map.put(b[j] , map.get(b[j])-1);
        }
        return true;
    }
}
