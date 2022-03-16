package ProblemasArrays;

public class Shuflle {
    public static int[] shuffle(int[] nums, int n) {
        int [] numeros=new int[2*n];
        int a=0, b=n;
        for(int i=0; i<nums.length; i++){
            if(i%2==0){
                numeros[i]=nums[a];
                a++;
            }else{
                numeros[i]=nums[b];
                b++;
            }
        }
        return numeros;
    }

    public static void main(String[] args) {
        int []  nums={1,2,3,4,4,3,2,1};
        int [] h= shuffle(nums, 6);
        for(int i=0; i<h.length; i++){
            System.out.println(h[i]);
        }
    }

}
