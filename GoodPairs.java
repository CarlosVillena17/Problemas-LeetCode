package ProblemasArrays;

public class GoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        int pairs=0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==nums[j] && i<j){
                  pairs++;
                }
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
       int nums[]={1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }
}