class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
       int w=2;
       for(int r =2;r<n;r++){
        if(nums[r]!=nums[w-2]){
            nums[w]=nums[r];
            w++;
        }
       }
       return w;
    }
}