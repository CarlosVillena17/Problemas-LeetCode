package ProblemasArrays;

public class CadenasConsistentes {
    public  static int countConsistentStrings(String allowed, String[] words) {
        int num=0;
        boolean a=false;
        for(int i=0; i<words.length; i++){
             for(int j=0; j<words[i].length(); j++){
                 if(allowed.contains(String.valueOf(words[i].charAt(j)))){
                    a=true;
                 }else{
                     a=false;
                     break;
                 }
             }
             if(a==true){
                 num++;
             }

        }
        return  num;
    }
    public static void main(String[] args) {
        String palabras[]={"ad","bd","aaab","baa","badab"};
        String pala="ab";
        System.out.println(countConsistentStrings(pala, palabras));
    }
}
