class Solution {
    int i=0;
    public String decodeString(String s) {
        StringBuilder ans=new StringBuilder();
        while(i<s.length() && s.charAt(i)!=']'){
            if(Character.isDigit(s.charAt(i))){
                int num=0;
                while(i<s.length() && Character.isDigit(s.charAt(i))){
                    num=num*10+(s.charAt(i)-'0');
                    i++;
                }
                i++;
                String decoded=decodeString(s);
                i++;
                for(int j=0;j<num;j++){
                    ans.append(decoded);
                }}else{
                    ans.append(s.charAt(i));
                    i++;
                }
            }
             return ans.toString();
        }
       

        
    }
