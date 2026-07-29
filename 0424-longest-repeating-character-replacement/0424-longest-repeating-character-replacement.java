import java.util.*;
class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer>map=new HashMap<>();
        int left=0;
        int max=0;
        int maxLength=0;
        for(int right=0;right<s.length();right++){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            max=Math.max(max,map.get(s.charAt(right)));
            while(((right-left+1)-max)>k){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                if(map.get(s.charAt(left))==0){
                    map.remove(s.charAt(left));
                }
                left++;
            }
            maxLength=Math.max(maxLength,right-left+1);

        }
        return maxLength;
    }
}