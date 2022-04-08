package ProblemasArrays;

public class Truncate1816 {
    public static String truncateSentence(String s, int k) {
            int pos=s.length();
            int espacios=0;
            for(int i=0; i<s.length(); i++){

                if(s.charAt(i)==' '){
                    espacios++;
                    if(espacios==k){
                        pos=i;
                        break;
                    }
                }
            }
            return s.substring(0, pos);
    }

    public static void main(String[] args) {
        System.out.println(truncateSentence("chopper is not a tanuki", 5) );
        System.out.println("Hola mundo".substring(0, 5));
    }
}
