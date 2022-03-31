package ProblemasArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problema1773 {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int a=0;
        int result=0;
        if(ruleKey.equals("type")){
                a=0;
        }else if(ruleKey.equals("color")){
                a=1;
        }else if(ruleKey.equals("name")){
                a=2;
        }
        for(List<String> lista: items){
            if(lista.get(a).equals(ruleValue)){
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<List<String>> lista=new ArrayList<>();
        List<String>  l1= Arrays.asList("phone","blue","pixel");
        List<String>  l2= Arrays.asList("computer","silver","lenovo");
        List<String>  l3= Arrays.asList("phone","gold","iphone");
        lista.add(l1);
        lista.add(l2);
        lista.add(l3);
        System.out.println(countMatches(lista, "color", "silver"));
    }
}
