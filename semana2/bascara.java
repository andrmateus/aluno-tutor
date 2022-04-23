/*

2)Ler coeficientes reais a, b e c de uma equação de segundo grau e exibir a(s) raiz(es),
caso exista(m). Lembretes: Calcule o valor de delta. Se ele for negativo, não há
raízes.. Se for igual a zero, há uma única raiz. Se delta for maior do que zero, então
há duas raízes.

https://github.com/andrmateus/aluno-tutor

*/


package semana2;

import java.lang.Math;
import java.util.Scanner;

class bascara {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a, b, c;
        Double delta, bquad, x1, x2;

        //tela principal
        System.out.println("Calculo de Bascara");
        System.out.println("Insira o valor de a: ");
        a = scn.nextInt();
        System.out.println("Insira o valor de b: ");
        b = scn.nextInt();
        System.out.println("Insira o valor de c: ");
        c = scn.nextInt();
        
        //calculo bascara
        bquad = Math.pow(b, 2);
        
        delta = bquad  - (4 * a * c);

        x1 = ((b * -1) + Math.sqrt(delta))/ (2 * a);
        x2 = ((b * -1) - Math.sqrt(delta))/ (2 * a);


        //teste condicional
        if (delta < 0) {
            System.out.printf("delta = %.2f \n", delta);
            System.out.println("Não existem raizes para o valor de Delta.");
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