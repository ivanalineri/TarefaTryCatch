package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {
    public static void main(String[] args) {
        List<String> animais = new ArrayList<>();
        animais.add("Pato");
        animais.add("Cachorro");
        animais.add("Gato");

        try {
            System.out.println(animais.get(3));
        } catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

    }
}