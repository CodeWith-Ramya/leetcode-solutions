class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(int  i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i =0;i<t.length();i++){
            char ch1= t.charAt(i);
            if(map.containsKey(ch1)){
                map.put(ch1,map.get(ch1)-1);
                if(map.get(ch1)==0){
                map.remove(ch1);
            }

            }
            
            else {
                return false;
            }
        }
        return map.isEmpty();
    }
}