class Solution {
    public int lengthOfLastWord(String s) {
        String[] words=s.split(" ");
        int n=(words.length)-1;
        int m=words[n].length();
        return m;

    }
}