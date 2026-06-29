class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        HashSet<Integer> Set = new HashSet<>();
         HashSet<Integer> ansSet = new HashSet<>();
        for(int i =0;i<n1;i++){
            Set.add(nums1[i]);
        }
        for(int j=0;j<n2;j++){
            if(Set.contains(nums2[j])){
                ansSet.add(nums2[j]);
            }
        }
        int[] ans = new int[ansSet.size()];
        int i = 0;

        for (int num : ansSet) {
            ans[i] = num;
            i++;
        }

        return ans;
       

        
    }
}