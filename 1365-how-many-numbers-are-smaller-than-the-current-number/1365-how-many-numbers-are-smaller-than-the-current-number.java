class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int flag=0;
            for(int j=0;j<nums.length;j++){
                if(i==j){
                    continue;
                }
                else if(nums[j]<nums[i]){
                    flag++;
                }
            }
            ans[i]=flag;
        }
        return ans;
    }
}