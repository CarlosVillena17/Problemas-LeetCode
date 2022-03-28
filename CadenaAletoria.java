package ProblemasArrays;

public class CadenaAletoria {
    public static String restoreString(String s, int[] indices) {

         char [] cadena=new char[indices.length];
        for(int i=0; i<indices.length; i++){
           cadena[indices[i]]=s.charAt(i);
        }
        return new String(cadena);
    }

    public static void main(String[] args) {
        int[] indices={4,5,6,7,0,2,1,3};
        System.out.println(restoreString("leetcode", indices));
    }
}
