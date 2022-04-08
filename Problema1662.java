package ProblemasArrays;

public class Problema1662 {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String cad="";
        String cad2="";
        for(int i=0; i<word1.length; i++){
            cad+=word1[i];
        }
        for(int i=0; i<word2.length; i++){
            cad2+=word2[i];
        }

        if(cad.equals(cad2)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String [] a={"ab", "c"};
        String [] n={"a", "bc"};
        arrayStringsAreEqual(a, n);
    }
}
