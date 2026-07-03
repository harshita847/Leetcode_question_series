class Solution {
    public int differenceOfSum(int[] nums) {
        int em=0;
        int ds=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){

            em=em+nums[i];
            while(nums[i]!=0){
            int n=nums[i]%10;
            nums[i]=nums[i]/10;
            ds=ds+n;
            }
             sum=em-ds;
        }
           return sum;
    }
}