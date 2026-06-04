class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int max =0;
        for(int i = 0 ; i<arr.length;i++){
            
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i] , 1);
            }
        }
        for(int i=0;i<arr.length;i++){
            list.add(0);
        }
        
        map.forEach((key,value)->{
            list.set(key-1,value);
        });
        return list;
    }
}
