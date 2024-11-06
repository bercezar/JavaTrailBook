package edu.Collections.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set_ {
    public static void main(String []args){
        // HashSet: Conjunto não ordenado, não permite duplicatas

        Set<String> hashSet = new HashSet<>();
        hashSet.add("Item 1");
        hashSet.add("Item 2");
        hashSet.add("Item 1");  // Ignorado (duplicata)
        System.out.println(hashSet);  // Saída: [Item 1, Item 2] (ordem não garantida)

        // LinkedHashSet: Conjunto ordenado por ordem de inserção

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Item 1");
        linkedHashSet.add("Item 2");
        linkedHashSet.add("Item 1");  // Ignorado (duplicata)
        System.out.println(linkedHashSet);  // Saída: [Item 1, Item 2] (ordem mantida)

        // TreeSet: Conjunto ordenado (ordem natural)

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Item 2");
        treeSet.add("Item 1");
        System.out.println(treeSet);  // Saída: [Item 1, Item 2] (ordenado)

    }
}
