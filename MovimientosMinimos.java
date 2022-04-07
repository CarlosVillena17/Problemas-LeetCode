package ProblemasArrays;

import java.util.Arrays;

public class MovimientosMinimos {
    public static int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int movimientos=0;
        for(int i=0; i<seats.length; i++){
            movimientos+=Math.abs(seats[i]-students[i]);

        }
        return movimientos;
    }

    public static void main(String[] args) {
        int asientos[]={3,1,5};
        int estudiantes[]={2,7,4};
        System.out.println(minMovesToSeat(asientos, estudiantes));
    }
}
