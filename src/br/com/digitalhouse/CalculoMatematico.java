package br.com.digitalhouse;

public class CalculoMatematico {
    public double divisao (int numeroA, int numeroB) throws ArithmeticException{
        if (numeroB == 0) {
            throw new ArithmeticException("No es possible dividir por zero chiquito");
        }
        return numeroA / numeroB;
    }


}
