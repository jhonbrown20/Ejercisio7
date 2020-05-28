package Ejercisio7;

import java.util.Scanner;

public class Ejercisio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1;
        int suma = 0;
        int i = 0;
        do {
            System.out.println(" digite un numero");
            n1 = entrada.nextInt();
            suma = suma + n1;
            i++;
        } while (n1 != 0);
        System.out.println(" la suma de los numeros es " + suma);
        System.out.println(" la cantidad de veces es " + i);

    }

}
