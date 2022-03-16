package ProblemasArrays;

public class NumeroMaximo {
    public static int mostWordsFound(String[] sentences) {
        String [] words=new String[sentences.length];
        int max=0;
        for(int i=0; i<sentences.length; i++){
            words=sentences[i].split(" ");
            if(max<words.length){
                max=words.length;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String [] sentences={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }
}
