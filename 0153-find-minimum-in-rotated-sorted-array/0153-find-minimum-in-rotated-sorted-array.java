class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int l=0,r=n-1;

        int min=Integer.MAX_VALUE;

        while(l<=r){
            int mid=(l+r)/2;

            if(nums[mid]<nums[r]){
                min=Math.min(min,nums[mid]);
                r=mid-1;
            }
            else{
                min=Math.min(min,nums[mid]);
                l=mid+1;
            }

        }
        return min;
    }
}