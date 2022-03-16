package ProblemasArrays;

public class Palindromo {
    public boolean isPalindrome(int x) {
        int a=x;
        int palindromo=0;
        while(x>0){
            int rest=x%10;
            x=x/10;
            palindromo=palindromo*10+rest;
        }
        if(a==palindromo){
            return true;
        }else{
            return false;
        }

    }
}
