package Calculo;

import java.util.Scanner;

public class Calcular {
    double resultado;
    double primeiroValor;
    double segundoValor;
    
    public void somar(){
        
        resultado = getPrimeiroValor() + getSegundoValor();
        System.out.println("O valor da soma é: "+ getResultado());


    }

   public void setPrimeiroValor(double primeiroValor) {
       this.primeiroValor = primeiroValor;
   }
   public double getPrimeiroValor() {
       return primeiroValor;
   }
   public void setSegundoValor(double segundoValor) {
       this.segundoValor = segundoValor;
   }
   public double getSegundoValor() {
       return segundoValor;
   }
   public void setResultado(double resultado) {
       this.resultado = resultado;
   }
   public double getResultado() {
       return resultado;
   }
}
