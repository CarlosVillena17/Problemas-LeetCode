package ProblemasArrays;

import java.util.Arrays;

public class Problem1365 {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
            int [] resultado=new int[nums.length];
            for(int i=0; i<nums.length; i++){
                for(int j=0; j<nums.length; j++){
                    if(nums[i]>nums[j] && nums[i]!=nums[j]){
                        resultado[i]++;
                    }
                }
            }
            return resultado;
    }

    public static void main(String[] args) {
        int [] nums={8,1,2,2,3};
        Arrays.stream(smallerNumbersThanCurrent(nums)).forEach(System.out::println);
    }
}
