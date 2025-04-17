package Calculo;

import java.util.Scanner;

public class mostrarResultado {
    public static void main(String[] args) {
        Calcular valor = new Calcular();
        double x;
        double y;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        x = scan.nextDouble();
        valor.setPrimeiroValor(x);

        System.out.println("Digite o segundo valor: ");
        y = scan.nextDouble();
        valor.setPrimeiroValor(y);
        
        valor.somar();
    }
    
}
