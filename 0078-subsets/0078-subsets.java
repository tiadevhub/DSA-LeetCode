class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>current=new ArrayList<>();
        solve(nums,0,ans,current);
        return ans;
    }
    public void solve(int[] nums,int index,List<List<Integer>>ans,List <Integer> current){
        int n=nums.length;
        if(index==n){
            ans.add(new ArrayList<>(current));
            return ;
        }
        current.add(nums[index]);
        solve(nums,index+1,ans,current);

        current.remove(current.size()-1);
        solve(nums,index+1,ans,current);

        
    }
}