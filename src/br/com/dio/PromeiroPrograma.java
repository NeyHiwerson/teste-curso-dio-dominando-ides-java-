package br.com.dio;

import br.com.dio.model.Gato;

import java.util.Objects;

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

        Livro obra = new Livro("Histórias de uma fronteira", "Elizabeth Torton", 295, 2011);
        System.out.println(obra.toString());
        System.out.println("edytei essa linha no eclipse inportando via git import");
    }

public static class Livro {
        String nome;
        String autor;
        int numPag;
        int anoLanc;

    public Livro(String nome, String autor, int numPag, int anoLanc) {
        this.nome = nome;
        this.autor = autor;
        this.numPag = numPag;
        this.anoLanc = anoLanc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public int getAnoLanc() {
        return anoLanc;
    }

    public void setAnoLanc(int anoLanc) {
        this.anoLanc = anoLanc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return numPag == livro.numPag && anoLanc == livro.anoLanc && Objects.equals(nome, livro.nome) && Objects.equals(autor, livro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, autor, numPag, anoLanc);
    }

    @Override
    public String toString() {
        return "O Livro " + nome +
                " escrito por " + autor +
                " com " + numPag +
                " paginas, foi lançado em " + anoLanc +
                "." ;
    }
}


}
