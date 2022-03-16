package ProblemasArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problema1431 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       int max= Arrays.stream(candies).max().getAsInt();
       List<Boolean> lista=new ArrayList<>();
       Arrays.stream(candies)
               .map(
               n-> n+extraCandies
                ).forEach(n-> {
                   if(n<max){
                       lista.add(false);
                   }else{
                       lista.add(true);
                   }
               });

       return lista;
    }

    public static void main(String[] args) {
        int []candies = {2,3,5,1,3};
        kidsWithCandies(candies, 3).forEach(System.out::println);
    }
}
