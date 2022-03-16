package ProblemasArrays;

import java.util.Arrays;

public class Problema2011 {
    public static int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(int i=0; i<operations.length; i++){
            if(operations[i].equals("--X") || operations[i].equals("X--")){
                x--;
            }else if(operations[i].equals("++X") || operations[i].equals("X++")){
                x++;
            }
        }
        return x;

    }

    public static void main(String[] args) {
        String []operations = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));
    }
}
