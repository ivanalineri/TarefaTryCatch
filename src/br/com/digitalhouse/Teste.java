package br.com.digitalhouse;

public class Teste {
    public static void main(String[] args) {
        CalculoMatematico calculoMatematico = new CalculoMatematico();
        try {
            System.out.println(calculoMatematico.divisao(4, 0));
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

}
