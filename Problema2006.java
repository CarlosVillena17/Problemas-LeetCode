package ProblemasArrays;

public class Problema2006 {
    public static int countKDifference(int[] nums, int k) {
        int contador=0;
        for(int i=0; i<nums.length; i++){
            for(int j=1; j<nums.length; j++){
                if(j>i){
                    int temp=nums[i]-nums[j];
                    if(temp<0){
                        temp=-1*temp;
                    }
                    if(temp==k){
                        contador++;
                    }
                }
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        int nums[]={1,2,2,1};
        System.out.println(countKDifference(nums, 1));
    }
}
