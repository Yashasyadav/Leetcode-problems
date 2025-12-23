class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set <Integer> set=new HashSet<>();

        for(int i:nums1){
            set.add(i);
        }

        Set <Integer> resultset=new HashSet<>();
        for(int i:nums2){
            if(set.contains(i)){
                resultset.add(i);
            }
        }

        int[] result=new int [resultset.size()];
        int i = 0;
        for (int num : resultset) {
            result[i++] = num;
        }

        return result;
    }
}