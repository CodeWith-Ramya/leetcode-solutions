class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i =0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);


            }
            for(int val : nums){
                if(map.get(val)==1){
                    return val;
                }
        }
        return -1;
        
        
    }
}