class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        
        for(int i=0;i<nums.length;i++){
            int count1=0;
            int temp=nums[i];
            while(temp!=0){
                count1++;
                temp/=10;

            }
            if(count1%2==0){
                count++;
            }
        }
        return count;
        
    }
}