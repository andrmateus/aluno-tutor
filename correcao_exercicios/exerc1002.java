package correcao_exercicios;

import java.util.Scanner;

public class exerc1002 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        Double raio;
        Double pi = 3.14159;
        Double area;

        raio = leitura.nextDouble();

        //area = pi * Math.pow(raio, 2);
        area = pi * (raio * raio);

        System.out.printf("A=%.4f", area);


        leitura.close();
    }
}


