class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int size = set.size();

        if(n>size){
            return true;
        }
        else if(n==size){
            return false;
        }
        return false;
    }
}