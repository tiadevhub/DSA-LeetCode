class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashSet<Character>set=new HashSet<>();
        HashSet<Integer>freq=new HashSet<>();
        for(char c:s.toCharArray()){
            set.add(c);
        }
        for(char c:set){
            int count=0;
            for(char x:s.toCharArray()){
                if(c==x){
                    count++;
                }

            }
            freq.add(count);
        }
        return freq.size()==1;
        
    }
}