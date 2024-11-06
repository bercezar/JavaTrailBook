package edu.Collections.List;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;

public class Lista {
    public static void main(String []args){
        List<String> nomes = new ArrayList<>();
        
        //Lista genérica

        nomes.add("Bernardo");
        nomes.add("Gabriela");
        nomes.add("Gabriel");
        nomes.add("Gabriela");  // Permite duplicados
        nomes.add("Geovanna");
        // nomes.add(10);  Não permite pois a lista é do tipo String

        System.out.println("Nome: " + nomes);

        nomes.remove("Gabriela");

        System.out.println("Nome: " + nomes);


        // Iterando a lista
        for (String nome : nomes){  // ForEach
            System.out.println(nome);
        }

        if (nomes.contains("Jorge")){
            System.out.println("Contém");
        }
        else
            System.out.println("Não contém");


        // LinkedList: Lista encadeada, eficiente para inserções/remoções

        List<String> linkedList = new LinkedList<>();
        linkedList.add("Item 1");
        linkedList.add("Item 2");
        linkedList.addFirst("Item 0");  // Inserção rápida no início
        System.out.println(linkedList);  // Saída: [Item 0, Item 1, Item 2]
        
        // Vector: Lista sincronizada (thread-safe), menos eficiente que ArrayList

        List<String> vector = new Vector<>();
        vector.add("Item 1");
        vector.add("Item 2");
        System.out.println(vector);  // Saída: [Item 1, Item 2]
        
        // Stack: Estrutura LIFO (Last In, First Out), baseada em Vector

        Stack<String> stack = new Stack<>();
        stack.push("Item 1");
        stack.push("Item 2");
        System.out.println(stack.pop());  // Saída: Item 2 (último elemento removido)

    }
}
