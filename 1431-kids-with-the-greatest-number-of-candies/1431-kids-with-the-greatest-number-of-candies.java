class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int max = candies[0];
    for (int num : candies) {
    if (num > max) {
    max = num;
        }
        }

    List<Boolean> maxkid =new ArrayList<>();
    for(int num : candies){
        if((num+extraCandies)>=max){
            maxkid.add(true);
        }
        else{
            maxkid.add(false);
        }
    }
    return maxkid;
}
}