package br.com.dio;

import br.com.dio.model.Gato;

public class PromeiroPrograma {
    public static void main(String[] args) {
        /*
        String $ = "R$";
        int n1 = 5;
        int n2 = 12;
        System.out.println("A soma dos valores é " + $ + (n1 + n2) + ".");
        System.out.println("Maravilha esse Intellij");
        */

        Gato miau = new Gato("Bichano", "amarelo", 4);
        System.out.println(miau);
        System.out.println(miau.toString());
    }


}
