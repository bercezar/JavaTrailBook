package edu.Collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.TreeMap;


public class Map_ {
    public static void main(String []args){

        // HashMap: Mapa não ordenado, chaves únicas

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Chave 1", 100);
        hashMap.put("Chave 2", 200);
        hashMap.put("Chave 1", 300);  // Substitui o valor da chave 1
        System.out.println(hashMap);  // Saída: {Chave 1=300, Chave 2=200}

        // LinkedHashMap: Mapa ordenado por ordem de inserção

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Chave 1", 100);
        linkedHashMap.put("Chave 2", 200);
        System.out.println(linkedHashMap);  // Saída: {Chave 1=100, Chave 2=200} (ordem mantida)

        // TreeMap: Mapa ordenado por ordem natural das chaves

        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Chave 2", 200);
        treeMap.put("Chave 1", 100);
        System.out.println(treeMap);  // Saída: {Chave 1=100, Chave 2=200} (ordenado)


    }
}
