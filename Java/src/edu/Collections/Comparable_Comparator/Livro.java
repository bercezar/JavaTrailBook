package edu.Collections.Comparable_Comparator;

import java.util.Comparator;

class Livro implements Comparable<Livro>{
    private int ano;
    private String autor;
    private String titulo;

    // Método construtor
    public Livro(int ano, String autor, String titulo){
        this.ano = ano;
        this.autor = autor;
        this.titulo = titulo;
    }

    // Ordenando livro por ano
    @Override
    public int compareTo(Livro l){
        return Integer.compare(this.ano, l.ano); // Usa-se Integer visto que o tipo int é um tipo primitivo que não possui métodos com si.
    }

    public int getAno(){
        return ano;
    }

    public String getAutor(){
        return autor;
    }

    public String getTitulo(){
        return titulo;
    }


class CompararAutor implements Comparator<Livro>{    
    // Para implementação do comparator deve-se criar outra classe.
    // Caso fosse feito a comparação na classe principal, deve-se utilizar o:
    //                  Collections.sort(List, Comparator)
    @Override
    public int compare(Livro l1, Livro l2){
        return l1.getAutor().compareTo(l2.getAutor());

        // o método compare da interface Comparator retorna um int é que ele está implementando uma comparação, e não retornando diretamente o nome do autor.
    }
}


class CompararTitulo implements Comparator<Livro>{
    @Override
    public int compare(Livro l1, Livro l2){
        return l1.getTitulo().compareTo(l2.getTitulo());
    }
}
}
