package ProblemasArrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Problema1389 {
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> arr=new LinkedList<>();
        for(int i=0; i<nums.length; i++){
           arr.add(index[i], nums[i]);
        }
       int a[]=new int[nums.length];
        for(int i=0; i<a.length; i++){
            a[i]=arr.get(i);
        }
        return  a;

    }

    public static void main(String[] args) {
        int nums[]={0,1,2,3,4};
        int index[]={0,1,2,2,1};
        createTargetArray(nums,index);
    }
}
