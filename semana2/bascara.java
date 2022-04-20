package semana2;

import java.lang.Math;
import java.util.Scanner;

class bascara {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a, b, c;
        Double delta, bquad, x1, x2;

        System.out.println("Calculo de Bascara");
        System.out.println("Insira o valor de a: ");
        a = scn.nextInt();
        System.out.println("Insira o valor de b: ");
        b = scn.nextInt();
        System.out.println("Insira o valor de c: ");
        c = scn.nextInt();
        
        
        bquad = Math.pow(b, 2);
        
        delta = bquad  - (4 * a * c);

        x1 = ((b * -1) + Math.sqrt(delta))/ (2 * a);
        x2 = ((b * -1) - Math.sqrt(delta))/ (2 * a);

        if (delta < 0) {
            System.out.println("Não existem raizes negativas.");
        } else if (delta == 0) {
            System.out.println(x1);            
        } else {
            System.out.printf("delta  = %.2f \n", delta);
            System.out.printf("x'  = %.2f \n", x1);
            System.out.printf("x'' = %.2f", x2);
        }

        scn.close();       
    }
}