package ProblemasArrays;

import java.util.Arrays;

public class MaximunProduct {
    public static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int mayor=0;
        int a=nums[0];
        int b=nums[nums.length-1];
        for(int i=1; i<nums.length; i++){
            mayor=Math.max( b*nums[nums.length-i-1]-a*nums[i], mayor);
            System.out.println(mayor);
        }
        return mayor;
    }

    public static void main(String[] args) {
        int [] nums={4,2,5,9,7,4,8};
        System.out.println(maxProductDifference(nums));

    }

}
