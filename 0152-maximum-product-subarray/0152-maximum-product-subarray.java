class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        int global=nums[0];

        for(int i=1;i<nums.length;i++){
            int curr=nums[i];

            int temp=Math.max(curr,Math.max(max*curr,min*curr));
            min=Math.min(curr,Math.min(min*curr,max*curr));
            max=temp;
            global=Math.max(global,max);

        }

        return global;
    }
}