package ProblemasArrays;

import java.util.Arrays;

public class Xor {
    public static int[] decode(int[] encoded, int first) {
        int n = encoded.length, res[] = new int[n + 1];
        res[0] = first;
        for (int i = 0; i < n; ++i)
            res[i + 1] = res[i] ^ encoded[i];
        return res;
    }
    public static void main(String[] args) {
        int [] encoded = {1,2,3};
        Arrays.stream(decode(encoded, 1)).forEach(System.out::println);
        System.out.println(2^1);
    }
}
