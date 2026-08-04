class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        String arr[]=s.split(" ");
        for(int i=0;i<arr.length;i++){
            StringBuilder ans=new StringBuilder();
            char arr1[]=arr[i].toCharArray();
            for(int j=arr1.length-1;j>=0;j--){
                ans.append(arr1[j]);
            }
            sb.append(ans);
            if(i!=arr.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}