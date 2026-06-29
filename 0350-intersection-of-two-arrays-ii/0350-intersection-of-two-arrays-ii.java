class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int count =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int i =0;i<n1;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        for(int num : nums2 ){
            if(map.containsKey(num)&& map.get(num)>0){
               list.add(num);
               map.put(num,map.get(num)-1); 
            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;

        
    }
}