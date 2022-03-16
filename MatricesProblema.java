package ProblemasArrays;

public class MatricesProblema {
    public static int maximumWealth(int[][] accounts) {
        int maximo=0;
        for(int i=0; i<accounts.length; i++){
            int suma=0;
            for(int j=0; j<accounts[i].length; j++){
                suma+=accounts[i][j];
            }
            if(suma>maximo){
                maximo=suma;
            }
        }
        return  maximo;
    }

    public static void main(String[] args) {
        int[][] accounts={{1,2,3},{1,2,3}};
        System.out.println(maximumWealth(accounts));
    }
}
