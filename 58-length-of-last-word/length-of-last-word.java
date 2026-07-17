class Solution {
    public int lengthOfLastWord(String s) {
        String m=s.trim();
        int count=0;

        for(int i=m.length()-1;i>=0;i--){
           
             
             if(m.charAt(i)!=' '){
                ++count;

            }
            else return count;
        }
        return count;
    }
}