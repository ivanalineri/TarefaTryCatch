package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Exercicio2 {
    public static void main(String[] args) {
        List<String> animais = new ArrayList<>();
        try {
            animais.add("Pato");
            animais.add("Cachorro");
            animais.add("Gato");
            System.out.println(animais.get(5));
        }catch (IndexOutOfBoundsException | NullPointerException e){
            System.out.println(e.getMessage() );
            e.printStackTrace();
        }


    }
}
