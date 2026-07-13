class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        int sumed=0;
        for(int i=0;i<n;i++){
              sum=sum+nums[i];
        }
         sumed=n*(n+1)/2;
        if(sum==sumed){
            return 0;
        }
        return sumed-sum;
    }
}